package ivlev.ivlevback.chat.actor_participation.models;

import ivlev.ivlevback.chat.message.models.Message;
import ivlev.ivlevback.chat.dialog.models.Dialog;
import ivlev.ivlevback.models.Person;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "actor_participation")
public class ActorParticipation {

    @Id
    @GeneratedValue(generator = "uuid2")
    private UUID id = UUID.randomUUID();

    @ManyToOne
    @JoinColumn(name = "dialog_id")
    private Dialog dialog;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Person user;

    @OneToMany(mappedBy = "actorParticipation", fetch = FetchType.EAGER)
    private List<Message> messages = new ArrayList<>();

    public ActorParticipation(Dialog dialog, Person user) {
        this.dialog = dialog;
        this.user = user;
    }

    public ActorParticipation() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Dialog getDialog() {
        return dialog;
    }

    public void setDialog(Dialog dialog) {
        this.dialog = dialog;
    }

    public Person getUser() {
        return user;
    }

    public void setUser(Person user) {
        this.user = user;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
