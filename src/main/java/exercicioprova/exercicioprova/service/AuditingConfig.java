package exercicioprova.exercicioprova.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import exercicioprova.exercicioprova.model.Accounting;

@Configuration
@EnableJpaAuditing
public class AuditingConfig {
	@Bean
	public AuditorAware<Accounting> auditorAware() {
		return new SpringSecurityAuditorAware();
	}
}
