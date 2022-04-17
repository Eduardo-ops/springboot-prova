package exercicioprova.exercicioprova.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import exercicioprova.exercicioprova.model.Accounting;

public interface AccountingDAO extends JpaRepository<Accounting, Long> {
	
}
