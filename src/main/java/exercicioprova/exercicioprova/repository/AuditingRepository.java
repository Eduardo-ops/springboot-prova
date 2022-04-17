package exercicioprova.exercicioprova.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import exercicioprova.exercicioprova.model.Auditing;

public interface AuditingRepository extends JpaRepository<Auditing, Long> {

}
