package exercicioprova.exercicioprova.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import exercicioprova.exercicioprova.model.Accounting;

public interface AccountingRepository extends JpaRepository<Accounting, Integer> {

}
