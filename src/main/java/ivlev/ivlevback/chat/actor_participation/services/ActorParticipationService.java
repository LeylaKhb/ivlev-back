package ivlev.ivlevback.chat.actor_participation.services;

import ivlev.ivlevback.chat.actor_participation.models.ActorParticipation;
import ivlev.ivlevback.chat.actor_participation.repositories.ActorParticipationRepository;
import ivlev.ivlevback.chat.dialog.models.Dialog;
import ivlev.ivlevback.chat.message.models.Message;
import ivlev.ivlevback.models.Person;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Optional;

@Service
public class ActorParticipationService {
    private final ActorParticipationRepository actorParticipationRepository;

    public ActorParticipationService(ActorParticipationRepository actorParticipationRepository) {
        this.actorParticipationRepository = actorParticipationRepository;
    }

    public ActorParticipation createActorParticipation(Dialog dialog, Person user) {
        ActorParticipation actorParticipation = new ActorParticipation(dialog, user);
        return actorParticipationRepository.save(actorParticipation);
    }

    public ActorParticipation findByDialogAndUser(Dialog dialog, Person user) throws UserPrincipalNotFoundException {
        Optional<ActorParticipation> optionalActorParticipation = actorParticipationRepository.findByDialogAndUser(dialog, user);
        if (optionalActorParticipation.isEmpty())
            throw new UserPrincipalNotFoundException("no such a dialog with such a user");
        return optionalActorParticipation.get();
    }

    public void addMessage(ActorParticipation actorParticipation, Message message) {
        actorParticipation.getMessages().add(message);
        actorParticipationRepository.save(actorParticipation);
    }

}
