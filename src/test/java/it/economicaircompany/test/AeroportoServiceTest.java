package it.economicaircompany.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import it.economicaircompany.mvc.model.Aeroporto;
import it.economicaircompany.mvc.model.Volo;
import it.economicaircompany.mvc.service.AeroportoService;

@SpringBootTest
@AutoConfigureMockMvc
class AeroportoServiceTest {
	@Autowired
	AeroportoService aeroportoService;

	@Test
	void testInserisciAeroporto() {
		assertEquals(aeroportoService.getAllAeroporti().size(), 0);
		Aeroporto a = new Aeroporto();
		a.setCitta("HappyLand");
		a.setCodice("123");

		a.setNazione("Jamaica");
		a.setNome("Idk");

		Volo v = new Volo();
		v.setAeroportoArrivo(a);
		v.setAeroportoPartenza(a);
		v.setDataArrivo(null);
		v.setDataPartenza(null);

		Volo v2 = new Volo();
		v2.setAeroportoArrivo(a);
		v2.setAeroportoPartenza(a);
		v2.setDataArrivo(null);
		v2.setDataPartenza(null);
		List<Volo> vList = new ArrayList<>();
		vList.add(v2);
		vList.add(v);
		a.setVoli(vList);
		aeroportoService.salvaAeroporto(a);
		assertEquals(aeroportoService.getAllAeroporti().size(), 1);
	}

}
