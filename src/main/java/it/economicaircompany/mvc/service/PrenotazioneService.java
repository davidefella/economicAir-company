package it.economicaircompany.mvc.service;

import java.util.List;

import it.economicaircompany.mvc.model.Prenotazione;
import it.economicaircompany.mvc.repository.PrenotazioneRepository;

public class PrenotazioneService {
	PrenotazioneRepository prenotazioneRepository;

	public List<Prenotazione> getAllPrenotazione() {
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
}
