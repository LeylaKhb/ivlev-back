package ivlev.ivlevback.controllers;


import ivlev.ivlevback.chat.actor_participation.models.ActorParticipation;
import ivlev.ivlevback.chat.dialog.models.Dialog;
import ivlev.ivlevback.chat.dialog.services.DialogService;
import ivlev.ivlevback.chat.message.models.Message;
import ivlev.ivlevback.chat.message.services.MessageService;
import ivlev.ivlevback.controllers.params.DialogDTO;
import ivlev.ivlevback.controllers.params.MessageDto;
import ivlev.ivlevback.models.Person;
import ivlev.ivlevback.models.Role;
import ivlev.ivlevback.security.PersonDetails;
import ivlev.ivlevback.service.PersonDetailsService;
import ivlev.ivlevback.utils.JWTUtil;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DialogController {
    private final DialogService dialogService;
    private final MessageService messageService;
    private final JWTUtil jwtUtil;
    private final PersonDetailsService personDetailsService;
    public DialogController(DialogService dialogService, MessageService messageService, JWTUtil jwtUtil, PersonDetailsService personDetailsService) {
        this.dialogService = dialogService;
        this.messageService = messageService;
        this.jwtUtil = jwtUtil;
        this.personDetailsService = personDetailsService;
    }

    @PostMapping("/create")
    public String createDialog() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();

        Dialog dialog = dialogService.createDialog(personDetails.getPerson());
        return dialog.getId().toString();
    }

    @GetMapping("/all_dialogs")
    public List<Dialog> getDialogs() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();

        if (personDetails.getAuthorities().contains(new SimpleGrantedAuthority(Role.ROLE_ADMIN.toString())))
            return dialogService.findAllDialogs();
        return Collections.EMPTY_LIST;
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

        List<Message> messages = messageService.findAllByDialogId(dialog);
        List<MessageDto> messagesDto = messages.stream()
                .map(message -> new MessageDto(message.getTextContext(), message.getActorParticipation().getUser().getName()))
                .collect(Collectors.toList());
        System.out.println(dialog.getId());
        System.out.println(messages.size());
        return new DialogDTO(dialog.getId(), messagesDto);
    }


    @MessageMapping("/dialog/{jwt}/{id}")
    @SendTo("/chat/dialog/{jwt}/{id}")
    public String processMessage(@DestinationVariable("jwt") String jwt, @DestinationVariable("id") String id,
                                 @Payload String message) throws UserPrincipalNotFoundException {
        String username = jwtUtil.validateTokenAndRetrieveClaim(jwt);

        PersonDetails userDetails = (PersonDetails) personDetailsService.loadUserByUsername(username.toLowerCase());
        Person person = userDetails.getPerson();
        messageService.create(message, id, person);
        return person.getName() + "~%&" + message;
    }
}
