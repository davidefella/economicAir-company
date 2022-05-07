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

import it.economicaircompany.mvc.model.Prenotazione;
import it.economicaircompany.mvc.service.PrenotazioneService;

@RestController
@RequestMapping("/api")
public class PrenotazioneController {

	Logger logger = LoggerFactory.getLogger(PrenotazioneController.class);
	
	@Autowired
	PrenotazioneService prenotazioneService;
	
	@GetMapping("/prenotazioni")
	public List<Prenotazione> getAllPrenotazioni() {
		return prenotazioneService.getAllPrenotazioni();
	}
	
	@PostMapping("/inserisciPrenotazione")
	public Prenotazione inserisciPrenotazione(@RequestBody Prenotazione prenotazione) {
		return prenotazioneService.salvaPrenotazione(prenotazione);
	}
	
	@DeleteMapping("/eliminaPrenotazione")
	public HttpStatus deletePrenotazione(@RequestParam Long idPrenotazione) {
		prenotazioneService.deletePrenotazione(idPrenotazione);
		return HttpStatus.OK;
	}
	
	@PutMapping("/aggiornaPrenotazione")
	public Prenotazione aggiornaPrenotazione(@RequestBody Prenotazione prenotazione) {
		return prenotazioneService.updatePrenotazione(prenotazione);
	}
	
	@GetMapping("/sumBiglietti")
	public double getSumBiglietti() {
		return prenotazioneService.getSumBiglietti();
	}
}
