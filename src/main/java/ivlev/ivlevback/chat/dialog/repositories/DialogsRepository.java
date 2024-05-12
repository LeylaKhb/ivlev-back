package ivlev.ivlevback.chat.dialog.repositories;

import ivlev.ivlevback.chat.dialog.models.Dialog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DialogsRepository  extends JpaRepository<Dialog, UUID> {
}
