package it.economicaircompany.mvc.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import it.economicaircompany.mvc.model.Prenotazione;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione,Long>{		
	
	Page<Prenotazione> findByVoloAeroportoPartenzaCodice(Pageable page, String codice);
	
}
