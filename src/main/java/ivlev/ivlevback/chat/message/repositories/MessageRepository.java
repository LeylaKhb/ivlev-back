package ivlev.ivlevback.chat.message.repositories;

import ivlev.ivlevback.chat.dialog.models.Dialog;
import ivlev.ivlevback.chat.message.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface MessageRepository  extends JpaRepository<Message, UUID> {
    public List<Message> findAllByDialog(Dialog dialog);
}
