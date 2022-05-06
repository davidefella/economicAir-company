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

import it.economicaircompany.mvc.model.Volo;
import it.economicaircompany.mvc.service.VoloService;

@RestController
@RequestMapping("/api")
public class VoloController {
	
	Logger logger = LoggerFactory.getLogger(VoloController.class);
	
	@Autowired
	VoloService voloService;
	
	@GetMapping("/voli")
	public List<Volo> getAllVoli() {
		return voloService.getAllVoli();
	}
	
	@PostMapping("inserisciVolo")
	public Volo inserisciVolo(@RequestBody Volo volo) {
		return voloService.salvaVolo(volo);
	}
	
	@DeleteMapping("eliminaVolo")
	public HttpStatus deleteVolo(@RequestParam Long idVolo) {
		voloService.deleteVolo(idVolo);
		return HttpStatus.OK;
	}
	
	@PutMapping("aggiornaVolo")
	public Volo aggiornaVolo(@RequestBody Volo volo) {
		return voloService.updateVolo(volo);
	}
}
