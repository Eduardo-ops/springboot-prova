package exercicioprova.exercicioprova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import exercicioprova.exercicioprova.dao.AccountingDAO;
import exercicioprova.exercicioprova.dao.AuditingDAO;
import exercicioprova.exercicioprova.model.Accounting;
import exercicioprova.exercicioprova.model.Auditing;

import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Service
public class AccountingService {

	@Autowired
	private AccountingDAO repo;
	private AuditingDAO repoAuditing;

	public List<Accounting> findAll() {
		return repo.findAll();
	}

	public List<Auditing> findAllAuditing() {
		return repoAuditing.findAll();
	}

	public Accounting createAccounting(@RequestBody Accounting accounting) {
		return repo.save(accounting);
	}

	public ResponseEntity updateAccounting(@PathVariable("id") Long id, @RequestBody Accounting accounting) {
		return repo.findById(id).map(record -> {
			record.setType(accounting.getType());
			record.setDescription(accounting.getDescription());
			record.setDate(accounting.getDate());
			record.setValue(accounting.getValue());
			record.setProfit(accounting.getProfit());
			Accounting updated = repo.save(record);
			return ResponseEntity.ok().body(updated);
		}).orElse(ResponseEntity.notFound().build());
	}

	public ResponseEntity<?> deleteAccounting(long id) {
		return repo.findById(id).map(record -> {
			repo.deleteById(id);
			return ResponseEntity.ok().build();
		}).orElse(ResponseEntity.notFound().build());
	}

}
