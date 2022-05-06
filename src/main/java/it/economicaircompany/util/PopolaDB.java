package it.economicaircompany.util;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.economicaircompany.mvc.model.Aeroporto;
import it.economicaircompany.mvc.model.Prenotazione;
import it.economicaircompany.mvc.model.Volo;
import it.economicaircompany.mvc.service.AeroportoService;
import it.economicaircompany.mvc.service.PrenotazioneService;
import it.economicaircompany.mvc.service.VoloService;

@Component
public class PopolaDB implements CommandLineRunner {

	@Autowired
	VoloService voloService;
	@Autowired
	PrenotazioneService prenotazioneService;
	@Autowired
	AeroportoService aeroportoService;

	@Override
	public void run(String... args) throws Exception {

		Aeroporto aeroportoFiumicino = new Aeroporto();
		aeroportoFiumicino.setCitta("Fiumicino");
		aeroportoFiumicino.setCodice("ABC");
		aeroportoFiumicino.setNazione("ITALIA");
		aeroportoFiumicino.setNome("Aeroporto internazionale Leonardo da Vinci");

		aeroportoService.salvaAeroporto(aeroportoFiumicino);

		Volo volo1 = new Volo();
		volo1.setAeroportoArrivo(aeroportoFiumicino);
		volo1.setAeroportoPartenza(aeroportoFiumicino);
		volo1.setDataArrivo(LocalDateTime.now());
		volo1.setDataPartenza(LocalDateTime.now());
		voloService.salvaVolo(volo1);

		Prenotazione prenotazione1 = new Prenotazione();
		prenotazione1.setCodice("001");
		prenotazione1.setCodicePosto("A45");
		prenotazione1.setCostoBiglietto(9.99);
		prenotazione1.setDescrizione("Posto finestrino");
		prenotazione1.setVolo(volo1);
		prenotazioneService.salvaPrenotazione(prenotazione1);
	}
}
