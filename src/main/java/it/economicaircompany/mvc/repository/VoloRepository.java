
package it.economicaircompany.mvc.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.economicaircompany.mvc.model.Aeroporto;
import it.economicaircompany.mvc.model.Volo;

public interface VoloRepository extends JpaRepository<Volo, Long> {
	
	public List<Volo> getVoliByAeroportoArrivo(Aeroporto aeroportoArrivo);
	
	public List<Volo> findByStartDateBetween(LocalDateTime dataPartenza, LocalDateTime dataArrivo);
}
