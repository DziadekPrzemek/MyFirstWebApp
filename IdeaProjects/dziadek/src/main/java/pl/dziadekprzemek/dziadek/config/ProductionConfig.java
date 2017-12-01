package pl.dziadekprzemek.dziadek.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import pl.dziadekprzemek.dziadek.backend.service.EmailService;
import pl.dziadekprzemek.dziadek.backend.service.SmtpEmailService;


@Configuration
@Profile("prod")
@PropertySource("classpath:application-dev.properties.txt")
public class ProductionConfig {

	@Bean
	public EmailService emailService(){
		return new SmtpEmailService();

	}
}
