package ivlev.ivlevback.aspect;

import ivlev.ivlevback.dto.PersonDTO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NewUserLoggingAspect {

    public static final Logger LOGGER = LoggerFactory.getLogger(NewUserLoggingAspect.class.getName());

    @Pointcut("@annotation(ivlev.ivlevback.aspect.annotation.NewUserLogging)")
    public void logUserCreation() {

    }

    @Before("logUserCreation()")
    public void log(JoinPoint joinPoint) {
        if (joinPoint.getArgs().length < 1) {
            LOGGER.info("Args length is 0");
            return;
        }

        Object arg = joinPoint.getArgs()[0];
        if (arg == null) {
            LOGGER.info("CreateUserRequestDto is null");
            return;
        }

        PersonDTO personDTO = (PersonDTO) arg;
        if (isValidUser(personDTO)) {
            LOGGER.info("CreateUserRequestDto with email {} is correct", personDTO.getEmail());
        } else {
            LOGGER.info("CreateUserRequestDto with email {} is wrong", personDTO.getEmail());

        }
    }

    private boolean isValidUser(PersonDTO personDTO) {
        String name = personDTO.getName();
        String email = personDTO.getEmail();
        String password = personDTO.getPassword();
        return !name.isBlank() && !email.isBlank() && !password.isBlank();
    }
}