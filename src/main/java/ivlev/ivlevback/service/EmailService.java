package ivlev.ivlevback.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendEmail(String to, String message) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject("Восстановление пароля на сайте https://ivlev-ff.ru");
        simpleMailMessage.setText(message);
        mailSender.send(simpleMailMessage);

        mailSender.send(simpleMailMessage);
    }
}
