package it.economicaircompany.mvc.controller.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.economicaircompany.mvc.model.Utente;
import it.economicaircompany.mvc.service.UtenteService;

@RestController
@RequestMapping("/api")
public class UtenteController {

	Logger logger = LoggerFactory.getLogger(UtenteController.class);
	
	@Autowired
	UtenteService utenteService;
	
	@GetMapping("/utenti")
	public List<Utente> getAllUtenti() {
		return utenteService.getAllUtenti();
	}
	
	@PostMapping("/inserisciUtente")
	public Utente inserisciUtente(@RequestBody Utente utente) {
		return utenteService.inserisciUtente(utente);
	}
	
	@DeleteMapping("/eliminaUtente")
	public HttpStatus deleteUtente(@RequestParam Long idUtente) {
		utenteService.deleteUtente(idUtente);
		return HttpStatus.OK;
	}
	
	@PutMapping("/aggiornaUtente")
	public Utente aggiornaUtente(@RequestBody Utente utente) {
		return utenteService.aggiornaUtente(utente);
	}
	
}
