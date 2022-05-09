package it.economicaircompany.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.economicaircompany.mvc.model.Prenotazione;
import it.economicaircompany.mvc.repository.PrenotazioneRepository;

@Service
public class PrenotazioneService {
	
	@Autowired
	PrenotazioneRepository prenotazioneRepository;

	public List<Prenotazione> getAllPrenotazioni() {
		return prenotazioneRepository.findAll();
	}

	public Prenotazione salvaPrenotazione(Prenotazione prenotazione) {
		return prenotazioneRepository.save(prenotazione);
	}

	public List<Prenotazione> saveAllPrenotazione(List<Prenotazione> prenotazione) {
		return prenotazioneRepository.saveAll(prenotazione);
	}

	public Prenotazione updatePrenotazione(Prenotazione prenotazione) {
		return prenotazioneRepository.save(prenotazione);
	}

	public void deletePrenotazione(Long id) {
		prenotazioneRepository.deleteById(id);
	}
	
	public double getSumBiglietti() {
		double sum = 0;
		for(Prenotazione p : getAllPrenotazioni())
			sum+=p.getCostoBiglietto();
		return sum;
	}
}
