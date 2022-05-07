package it.economicaircompany.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import it.economicaircompany.mvc.model.Utente;
import it.economicaircompany.mvc.service.UtenteService;

@SpringBootTest
@AutoConfigureMockMvc
public class UtenteServiceTest {

	@Autowired
	UtenteService utenteService;
	
	@Test
	void testInserisciUtente() {
		int numeroUtentiBefore = utenteService.getAllUtenti().size();
		
		Utente u = new Utente();
		u.setCodice("BDA");
		u.setCognome("MEZZ");
		u.setNome("VAL");
		
		utenteService.inserisciUtente(u);
		
		assertEquals(utenteService.getAllUtenti().size(), numeroUtentiBefore+1);
	}
}
