package ivlev.ivlevback.config;

import ivlev.ivlevback.service.PersonDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@ComponentScan({"ivlev.ivlevback"})
//@EntityScan("ivlev.ivlevback.models")
//@EnableJpaRepositories("ivlev.ivlevback.repositories")
public class SecurityConfig {
    private final PersonDetailsService personDetailsService;

    @Autowired
    public SecurityConfig(PersonDetailsService personDetailsService) {
        this.personDetailsService = personDetailsService;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.formLogin(formLogin -> formLogin
                .loginPage("/login")
                .loginProcessingUrl("/api/login")
                .defaultSuccessUrl("/personal_account")
                .failureForwardUrl("/login")
        ).authorizeHttpRequests(auth -> auth
                .requestMatchers("/admin").hasRole("ADMIN")
                .requestMatchers("/", "/login", "/registration").permitAll()
                .anyRequest().authenticated()
        ).csrf(csrf -> csrf
                .disable()
        ).logout(logout -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login"));
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return personDetailsService;
    }
}
