package exercicioprova.exercicioprova.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import exercicioprova.exercicioprova.model.Auditing;

public interface AuditingDAO extends JpaRepository<Auditing, Long> {

}
