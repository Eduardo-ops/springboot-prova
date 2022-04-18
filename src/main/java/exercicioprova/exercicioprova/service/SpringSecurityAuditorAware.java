package exercicioprova.exercicioprova.service;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

import exercicioprova.exercicioprova.model.Accounting;

public class SpringSecurityAuditorAware implements AuditorAware<Accounting> {

	@Override
	public Optional<Accounting> getCurrentAuditor() {
		return Optional.empty();
	}

}
