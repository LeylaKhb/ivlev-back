package ivlev.ivlevback.utils;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordUtil {
    private PasswordEncoder passwordEncoder;

    public PasswordUtil(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public boolean compare(String inputPassword, String userPassword) {
        return passwordEncoder.matches(inputPassword, userPassword);
    }
}
