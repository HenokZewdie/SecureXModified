package byAJ.Securex.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;

import java.security.Principal;

@Configuration
public class ThymeleafConfig {

    @Bean
    public SpringSecurityDialect springSecurityDialect(){

        return new SpringSecurityDialect();
    }
}
