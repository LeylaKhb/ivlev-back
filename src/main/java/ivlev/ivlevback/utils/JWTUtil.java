package ivlev.ivlevback.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JWTUtil {

    @Value("${jwt_secret}")
    private String secret;


    public String generateToken(String username) {
        return JWT.create()
                .withSubject("User details")
                .withIssuedAt(new Date())
                .withClaim("username", username)
                .sign(Algorithm.HMAC256(secret));
    }

    public String validateTokenAndRetrieveClaim(String token) {
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(secret))
                .withSubject("User details")
                .build();
        DecodedJWT decodedJWT = jwtVerifier.verify(token);
        String payload = decodedJWT.getPayload();
        return decodedJWT.getClaim("username").asString();
    }

}
