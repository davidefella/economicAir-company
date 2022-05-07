package it.economicaircompany.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.economicaircompany.mvc.model.Utente;
import it.economicaircompany.mvc.repository.UtenteRepository;

@Service
public class UtenteService {
	
	@Autowired
	UtenteRepository utenteRepository;
	
	public List<Utente> getAllUtenti() {
		return utenteRepository.findAll();
	}
	
	public Utente inserisciUtente(Utente utente) {
		return utenteRepository.save(utente);		
	}
	
	public void deleteUtente(Long id) {
		utenteRepository.deleteById(id);;
	}
	
	public Utente aggiornaUtente(Utente utente) {
		return utenteRepository.save(utente);
	}
}
