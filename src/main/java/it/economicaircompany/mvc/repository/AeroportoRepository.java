package it.economicaircompany.mvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.economicaircompany.mvc.model.Aeroporto;

public interface AeroportoRepository extends JpaRepository<Aeroporto,Long>{

	public List<Aeroporto> findAeroportoByNome(String nome);
}
