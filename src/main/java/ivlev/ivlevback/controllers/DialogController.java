package ivlev.ivlevback.controllers;


import ivlev.ivlevback.chat.actor_participation.models.ActorParticipation;
import ivlev.ivlevback.chat.actor_participation.services.ActorParticipationService;
import ivlev.ivlevback.chat.dialog.models.Dialog;
import ivlev.ivlevback.chat.dialog.services.DialogService;
import ivlev.ivlevback.chat.message.models.Message;
import ivlev.ivlevback.chat.message.services.MessageService;
import ivlev.ivlevback.controllers.params.DialogDTO;
import ivlev.ivlevback.controllers.params.MessageDto;
import ivlev.ivlevback.models.Person;
import ivlev.ivlevback.security.PersonDetails;
import ivlev.ivlevback.service.PersonDetailsService;
import ivlev.ivlevback.utils.JWTUtil;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
public class DialogController {
    private final DialogService dialogService;
    private final MessageService messageService;
    private final JWTUtil jwtUtil;
    private final PersonDetailsService personDetailsService;
    private final ActorParticipationService actorParticipationService;
    public DialogController(DialogService dialogService, MessageService messageService, JWTUtil jwtUtil, PersonDetailsService personDetailsService, ActorParticipationService actorParticipationService) {
        this.dialogService = dialogService;
        this.messageService = messageService;
        this.jwtUtil = jwtUtil;
        this.personDetailsService = personDetailsService;
        this.actorParticipationService = actorParticipationService;
    }

    @PostMapping("/create")
    public String createDialog() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();

        Dialog dialog = dialogService.createDialog(personDetails.getPerson());
        return dialog.getId().toString();
    }

    @GetMapping("/all_dialogs")
    public List<DialogDTO> getDialogs() {
        List<Dialog> dialogs = dialogService.findAllDialogs();
        List<DialogDTO> answer = new ArrayList<>();
        for (Dialog dialog : dialogs) {
            answer.add(createDialogDto(dialog));
        }
        return answer;
    }

    private DialogDTO createDialogDto(Dialog dialog) {
        List<Message> messages = messageService.findAllByDialogId(dialog);
        List<MessageDto> messagesDto = messages.stream()
                .map(message -> new MessageDto(message.getTextContext(), message.getActorParticipation().getUser().getName()))
                .collect(Collectors.toList());
        System.out.println(dialog.getId());
        System.out.println(messages.size());
        return new DialogDTO(dialog.getId(), messagesDto);
    }

    @CrossOrigin(origins = "https://ivlev-ff.ru")
    @GetMapping("/dialog")
    public DialogDTO getDialog() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();

        Person person = personDetails.getPerson();
        List<ActorParticipation> actorParticipations = person.getActorParticipations();
        Dialog dialog;
        if (actorParticipations.isEmpty()) {
             dialog = dialogService.createDialog(person);
        } else {
            dialog = actorParticipations.get(0).getDialog();
        }

        return createDialogDto(dialog);
    }

    @CrossOrigin(origins = "https://ivlev-ff.ru")
    @GetMapping("/dialog/{id}")
    public DialogDTO getDialogById(@PathVariable String id) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();
        Person person = personDetails.getPerson();

        Dialog dialog = dialogService.findById(UUID.fromString(id));
        actorParticipationService.checkActorParticipationExists(dialog, person);
        return createDialogDto(dialog);
    }


    @MessageMapping("/dialog/{jwt}/{id}")
    @SendTo("/chat/dialog/{id}")
    public String processMessage(@DestinationVariable("jwt") String jwt, @DestinationVariable("id") String id,
                                 @Payload String message) throws UserPrincipalNotFoundException {
        String username = jwtUtil.validateTokenAndRetrieveClaim(jwt);

        PersonDetails userDetails = (PersonDetails) personDetailsService.loadUserByUsername(username.toLowerCase());
        Person person = userDetails.getPerson();
        messageService.create(message, id, person);
        return person.getName() + "~%&" + message;
    }
}
