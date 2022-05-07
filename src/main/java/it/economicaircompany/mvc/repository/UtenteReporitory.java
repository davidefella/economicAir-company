package it.economicaircompany.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.economicaircompany.mvc.model.Utente;

public interface UtenteReporitory extends JpaRepository<Utente,Long>{

}
