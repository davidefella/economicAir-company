package it.economicaircompany.util;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

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
	
	public void popolaAeroportiByFile(String fileName) throws CsvValidationException {
		try (FileReader fr = new FileReader(fileName, StandardCharsets.UTF_8); CSVReader reader = new CSVReader(fr)) {

			String[] attributi = reader.readNext();
			for (String s : attributi) {
				attributi = s.toLowerCase().split(";");
			}

			String[] nextLine;
			while ((nextLine = reader.readNext()) != null) {
				for (String s2 : nextLine) {
					Aeroporto a = new Aeroporto();

					String[] valori = s2.toLowerCase().split(";");

					for (int i=0; i<valori.length;i++) {
						switch (attributi[i]) {
							case "nome": a.setNome(valori[i]); break;
							case "citta": a.setCitta(valori[i]); break;
							case "nazione": a.setNazione(valori[i]); break;
							case "codice": a.setCodice(valori[i]);	
						}
					}	
					aeroportoService.salvaAeroporto(a);						
				}
			}
		} catch (IOException e) {
			System.out.println("Errore durante l'apertura del file");
			e.printStackTrace();
		}
	}

	@Override
	public void run(String... args) throws Exception {
		
		popolaAeroportiByFile("prova.csv");
		
		Aeroporto aeroportoFiumicino = new Aeroporto();
		aeroportoFiumicino.setCitta("Fiumicino");
		aeroportoFiumicino.setCodice("ABC");
		aeroportoFiumicino.setNazione("ITALIA");
		aeroportoFiumicino.setNome("Leonardo-da-Vinci");

		Aeroporto aeroportoNizza = new Aeroporto();
		aeroportoNizza.setCitta("Nizza");
		aeroportoNizza.setCodice("FGH");
		aeroportoNizza.setNazione("Francia");
		aeroportoNizza.setNome("Raffaello");

		aeroportoService.salvaAeroporto(aeroportoFiumicino);
		aeroportoService.salvaAeroporto(aeroportoNizza);

		Volo volo1 = new Volo();
		volo1.setAeroportoArrivo(aeroportoNizza);
		volo1.setAeroportoPartenza(aeroportoFiumicino);
		volo1.setDataArrivo(LocalDateTime.now());
		volo1.setDataPartenza(LocalDateTime.now());

		Volo volo2 = new Volo();
		volo2.setAeroportoArrivo(aeroportoFiumicino);
		volo2.setAeroportoPartenza(aeroportoNizza);
		volo2.setDataArrivo(LocalDateTime.now());
		volo2.setDataPartenza(LocalDateTime.now());

		voloService.salvaVolo(volo1);
		voloService.salvaVolo(volo2);

		Prenotazione prenotazione1 = new Prenotazione();
		prenotazione1.setCodice("001");
		prenotazione1.setCodicePosto("A45");
		prenotazione1.setCostoBiglietto(9.99);
		prenotazione1.setDescrizione("Posto finestrino");
		prenotazione1.setVolo(volo1);

		prenotazioneService.salvaPrenotazione(prenotazione1);
		
		Prenotazione p = new Prenotazione();
		for(int i=0; i<11; i++) {
			p = new Prenotazione();
			p.setVolo(volo1);
			p.setCodice("0"+i);
			p.setCodicePosto("0"+i);
			p.setCostoBiglietto(i);
			p.setDescrizione(""+i);
			prenotazioneService.salvaPrenotazione(p);
		}
		
		
	}
}
