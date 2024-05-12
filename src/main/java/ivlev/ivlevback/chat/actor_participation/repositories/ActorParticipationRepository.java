package ivlev.ivlevback.chat.actor_participation.repositories;


import ivlev.ivlevback.chat.actor_participation.models.ActorParticipation;
import ivlev.ivlevback.chat.dialog.models.Dialog;
import ivlev.ivlevback.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ActorParticipationRepository  extends JpaRepository<ActorParticipation, UUID> {
    Optional<ActorParticipation> findByDialogAndUser(Dialog dialog, Person user);
}
