package ivlev.ivlevback.config;

import jakarta.servlet.http.*;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException{
//        response.sendRedirect("/");
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, authException.getMessage());

    }
}
