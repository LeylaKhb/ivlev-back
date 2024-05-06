package ivlev.ivlevback.config;

import freemarker.cache.ClassTemplateLoader;
import freemarker.cache.TemplateLoader;
import ivlev.ivlevback.service.PersonDetailsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
    private final PersonDetailsService personDetailsService;
    private final JWTFilter jwtFilter;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public SecurityConfig(PersonDetailsService personDetailsService, JWTFilter jwtFilter, PasswordEncoder passwordEncoder) {
        this.personDetailsService = personDetailsService;
        this.jwtFilter = jwtFilter;
        this.passwordEncoder = passwordEncoder;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/login", "/registration").permitAll()
                .anyRequest().permitAll()
//        ).logout(logout -> logout
//                        .logoutUrl("/logout")
        ).csrf(csrf -> csrf.disable()
        ).cors(cors -> cors.disable()
        ).sessionManagement(sessionManagement -> sessionManagement
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        ).addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }

    @Bean
    AuthenticationManager authenticationManager() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(personDetailsService);
        provider.setPasswordEncoder(passwordEncoder);
        return new ProviderManager(provider);
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return personDetailsService;
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer(){
        freemarker.template.Configuration configuration = new freemarker.template.Configuration(freemarker.template.Configuration.VERSION_2_3_19);
        TemplateLoader templateLoader = new ClassTemplateLoader(this.getClass(), "/templates/");
        configuration.setTemplateLoader(templateLoader);
        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
        freeMarkerConfigurer.setConfiguration(configuration);
        return freeMarkerConfigurer;
    }
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
//                registry.addMapping("/login").allowedOrigins("http://95.163.229.71");
//                registry.addMapping("/api/answer_request").allowedOrigins("http://95.163.229.71");
//                registry.addMapping("/api/calculator").allowedOrigins("http://95.163.229.71");
//                registry.addMapping("/api/schedule").allowedOrigins("http://95.163.229.71");
//                registry.addMapping("/api/admin").allowedOrigins("http://95.163.229.71");
//                registry.addMapping("/api/admin_change").allowedOrigins("http://95.163.229.71");
//                registry.addMapping("/personal_account").allowedOrigins("http://95.163.229.71");
//                registry.addMapping("/change_password").allowedOrigins("http://95.163.229.71");
//                registry.addMapping("/change_person").allowedOrigins("http://95.163.229.71");
//                registry.addMapping("/new_order").allowedOrigins("http://95.163.229.71");
//                registry.addMapping("/current_orders").allowedOrigins("http://95.163.229.71");
//                registry.addMapping("/orders_history").allowedOrigins("http://95.163.229.71");
//                registry.addMapping("/recover_password").allowedOrigins("http://95.163.229.71");
//                registry.addMapping("/api/get_supply").allowedOrigins("*");
//                registry.addMapping("/logout").allowedOrigins("http://95.163.229.71");
//                registry.addMapping("/").allowedOrigins("http://95.163.229.71");
//                registry.addMapping("/new_password").allowedOrigins("http://95.163.229.71");

//                registry.addMapping("/registration").allowedOrigins("http://localhost:3000");
//                registry.addMapping("/login").allowedOrigins("http://localhost:3000");
//                registry.addMapping("/api/answer_request").allowedOrigins("http://localhost:3000");
//                registry.addMapping("/api/calculator").allowedOrigins("http://localhost:3000");
//                registry.addMapping("/api/schedule").allowedOrigins("http://localhost:3000");
//                registry.addMapping("/api/admin").allowedOrigins("http://localhost:3000");
//                registry.addMapping("/api/admin_change").allowedOrigins("http://localhost:3000");
//                registry.addMapping("/personal_account").allowedOrigins("http://localhost:3000");
//                registry.addMapping("/change_password").allowedOrigins("http://localhost:3000");
//                registry.addMapping("/change_person").allowedOrigins("http://localhost:3000");
//                registry.addMapping("/new_order").allowedOrigins("http://localhost:3000");
//                registry.addMapping("/current_orders").allowedOrigins("http://localhost:3000");
//                registry.addMapping("/orders_history").allowedOrigins("http://localhost:3000");
//                registry.addMapping("/recover_password").allowedOrigins("http://localhost:3000");
//                registry.addMapping("/api/get_supply").allowedOrigins("*");
//                registry.addMapping("/logout").allowedOrigins("http://localhost:3000");
//                registry.addMapping("/").allowedOrigins("http://localhost:3000");
//                registry.addMapping("/new_password").allowedOrigins("http://localhost:3000");

            }
        };
    }
}
