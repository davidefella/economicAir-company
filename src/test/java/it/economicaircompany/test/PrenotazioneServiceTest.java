package it.economicaircompany.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import it.economicaircompany.mvc.model.Prenotazione;
import it.economicaircompany.mvc.service.PrenotazioneService;


@SpringBootTest
@AutoConfigureMockMvc
public class PrenotazioneServiceTest {

	@Autowired
	PrenotazioneService prenotazioneService;
	
	@Test
	void sumBiglietti() {
		double sumBefore = prenotazioneService.getSumBiglietti();
		
		Prenotazione p = new Prenotazione();
		p.setCodicePosto("ASD");
		p.setCostoBiglietto(10.0);
		p.setCodice("AFK");
		p.setDescrizione("ciao");
		
		prenotazioneService.salvaPrenotazione(p);
		assertEquals(prenotazioneService.getSumBiglietti(), sumBefore+10.0);
	}
}
