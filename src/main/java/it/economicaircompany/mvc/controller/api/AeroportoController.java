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

import it.economicaircompany.mvc.model.Aeroporto;
import it.economicaircompany.mvc.service.AeroportoService;

@RestController
@RequestMapping("/api")
public class AeroportoController {

	Logger logger = LoggerFactory.getLogger(AeroportoController.class);
	
	@Autowired
	AeroportoService aeroportoService;
	
	@GetMapping("/aeroporti")
	public List<Aeroporto> getAllAeroporti() {
		return aeroportoService.getAllAeroporti();
	}
	
	@PostMapping("/inserisciAeroporto")
	public Aeroporto inserisciAeroporto(@RequestBody Aeroporto aeroporto) {
		return aeroportoService.salvaAeroporto(aeroporto);
	}
	
	@DeleteMapping("/eliminaAeroporto")
	public HttpStatus deleteAeroporto(@RequestParam Long idAeroporto) {
		aeroportoService.deleteAeroporto(idAeroporto);
		return HttpStatus.OK;
	}
	
	@PutMapping("/aggiornaAeroporto")
	public Aeroporto aggiornaAeroporto(@RequestBody Aeroporto aeroporto) {
		return aeroportoService.updateAeroporto(aeroporto);
	}
	
	@GetMapping("/aeroportiByNome")
	public List<Aeroporto> getAeroportiByNome(@RequestParam String nome){
		return aeroportoService.getAeroportoByNome(nome);
	}
	
	@GetMapping("aeroportoByID")
	public Aeroporto getAeroportoByID(@RequestParam Long idAeroporto) {
		return aeroportoService.getAeroportoByID(idAeroporto);
	}
}
