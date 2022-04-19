package exercicioprova.exercicioprova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import exercicioprova.exercicioprova.model.Accounting;
import exercicioprova.exercicioprova.model.Auditing;
import exercicioprova.exercicioprova.service.AccountingService;

import java.util.List;

@RestController
@RequestMapping("/accountings")
public class AccountingController {

	@Autowired
	private AccountingService service;

	@GetMapping("")
	public List<Accounting> findAll() {
		return service.findAll();
	}

	@GetMapping("/auditings")
	public List<Auditing> findAllAuditing() {
		return service.findAllAuditing();
	}

	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Accounting createAccounting(@RequestBody Accounting accounting) {
		return service.createAccounting(accounting);
	}

	@PutMapping("/{id}")
	public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Accounting accounting) {
		return service.updateAccounting(id, accounting);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable long id) {
		return service.deleteAccounting(id);
	}
}
