
package it.economicaircompany.mvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.economicaircompany.mvc.model.Aeroporto;
import it.economicaircompany.mvc.model.Volo;

public interface VoloRepository extends JpaRepository<Volo, Long> {
	
	public List<Volo> getVoliByAeroportoArrivo(Aeroporto aeroportoArrivo);
}
