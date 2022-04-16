package exercicioprova.exercicioprova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exercicioprova.exercicioprova.dto.AccountingDTO;
import exercicioprova.exercicioprova.model.Accounting;
import exercicioprova.exercicioprova.repository.AccountingRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AccountingService {

	@Autowired
	private AccountingRepository repo;

	public List<Accounting> findAll() {
		return repo.findAll();
	}

	public String createAccounting(Accounting accounting) {
		repo.save(accounting);
		return accounting.getCode();
	}

}
