package ivlev.ivlevback.chat.dialog.services;

import ivlev.ivlevback.chat.actor_participation.models.ActorParticipation;
import ivlev.ivlevback.chat.actor_participation.services.ActorParticipationService;
import ivlev.ivlevback.chat.dialog.models.Dialog;
import ivlev.ivlevback.chat.dialog.repositories.DialogsRepository;
import ivlev.ivlevback.chat.message.models.Message;
import ivlev.ivlevback.models.Person;
import ivlev.ivlevback.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DialogService {
    private final DialogsRepository dialogsRepository;

    private final ActorParticipationService actorParticipationService;

    private final PersonService personService;

    public DialogService(DialogsRepository dialogsRepository, ActorParticipationService actorParticipationService, PersonService personService) {
        this.dialogsRepository = dialogsRepository;
        this.actorParticipationService = actorParticipationService;
        this.personService = personService;
    }

    public Dialog createDialog(Person user) {
        Dialog dialog =  dialogsRepository.save(new Dialog());
        return addUser(dialog, user);
    }

    public Dialog addUser(Dialog dialog, Person user) {
        ActorParticipation actorParticipation = actorParticipationService.createActorParticipation(dialog, user);
        dialog.getActorParticipations().add(actorParticipation);
        return addAdmin(dialog);
    }

    public Dialog addAdmin(Dialog dialog) {
        Person admin = personService.getAdmin();
        ActorParticipation actorParticipation = actorParticipationService.createActorParticipation(dialog, admin);
        dialog.getActorParticipations().add(actorParticipation);
        return dialogsRepository.save(dialog);
    }


    public Dialog findById(UUID id) {
        Optional<Dialog> optionalDialog = dialogsRepository.findById(id);
        if (optionalDialog.isEmpty()) {
            throw new RuntimeException(String.format("dialog with id %s not found", id));
        }
        return optionalDialog.get();
    }

    public Dialog addMessage(Dialog dialog, Message message) {
        dialog.getMessages().add(message);
        return dialogsRepository.save(dialog);
    }

    public List<Dialog> findAllDialogs() {
//        User user = userService.getUser();
//        List<ActorParticipation> actorParticipations = actorParticipationService.findAllByUser(user);
//        return actorParticipations.stream()
//                .map(ActorParticipation::getDialog)
//                .collect(Collectors.toList());
        return dialogsRepository.findAll();
    }

}
