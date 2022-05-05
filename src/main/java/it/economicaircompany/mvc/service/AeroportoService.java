package it.economicaircompany.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.economicaircompany.mvc.model.Aeroporto;
import it.economicaircompany.mvc.repository.AeroportoRepository;

@Service
public class AeroportoService {
	@Autowired
	AeroportoRepository aeroportoRepository;

	public List<Aeroporto> getAllAeroporto() {
		return aeroportoRepository.findAll();
	}

	public Aeroporto salvaAeroporto(Aeroporto aeroporto) {
		return aeroportoRepository.save(aeroporto);
	}

	public List<Aeroporto> saveAllAeroporto(List<Aeroporto> aeroporto) {
		return aeroportoRepository.saveAll(aeroporto);
	}

	public Aeroporto updateAeroporto(Aeroporto aeroporto) {
		return aeroportoRepository.save(aeroporto);
	}

	public void deleteAeroporto(Long id) {
		aeroportoRepository.deleteById(id);
	}
}
