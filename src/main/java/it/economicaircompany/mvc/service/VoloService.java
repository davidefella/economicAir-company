package it.economicaircompany.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import it.economicaircompany.mvc.model.Volo;
import it.economicaircompany.mvc.repository.VoloRepository;

public class VoloService {
	@Autowired
	VoloRepository voloRepository;

	public List<Volo> getAllVolo() {
		return voloRepository.findAll();
	}

	public Volo salvaVolo(Volo volo) {
		return voloRepository.save(volo);
	}

	public List<Volo> saveAllVolo(List<Volo> volo) {
		return voloRepository.saveAll(volo);
	}

	public Volo updateVolo(Volo volo) {
		return voloRepository.save(volo);
	}

	public void deleteVolo(Long id) {
		voloRepository.deleteById(id);
	}
}
