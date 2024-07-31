package ivlev.ivlevback.chat.message.services;

import ivlev.ivlevback.chat.actor_participation.models.ActorParticipation;
import ivlev.ivlevback.chat.actor_participation.services.ActorParticipationService;
import ivlev.ivlevback.chat.dialog.models.Dialog;
import ivlev.ivlevback.chat.dialog.services.DialogService;
import ivlev.ivlevback.chat.message.models.Message;
import ivlev.ivlevback.chat.message.repositories.MessageRepository;
import ivlev.ivlevback.models.Person;
import ivlev.ivlevback.service.PersonService;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class MessageService {
    private MessageRepository messageRepository;
    private DialogService dialogService;
    private PersonService personService;
    private ActorParticipationService actorParticipationService;

    public MessageService(MessageRepository messageRepository, DialogService dialogService, PersonService personService, ActorParticipationService actorParticipationService) {
        this.messageRepository = messageRepository;
        this.dialogService = dialogService;
        this.personService = personService;
        this.actorParticipationService = actorParticipationService;
    }

    public Message create(String text, String dialogId, Person user) throws UserPrincipalNotFoundException {
        Dialog dialog = dialogService.findById(UUID.fromString(dialogId));


        ActorParticipation actorParticipation = actorParticipationService.findByDialogAndUser(dialog, user);

        Message message = new Message(dialog, text, actorParticipation);
        Message savedMessage = messageRepository.save(message);
        actorParticipationService.addMessage(actorParticipation, savedMessage);

        Dialog updatedDialog = dialogService.addMessage(dialog, savedMessage);
        return savedMessage;
    }

    public List<Message> findAllByDialogId(Dialog dialog) {
        return messageRepository.findAllByDialog(dialog);
    }
}
