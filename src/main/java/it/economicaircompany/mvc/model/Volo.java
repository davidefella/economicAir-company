package it.economicaircompany.mvc.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Volo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDateTime dataPartenza;
	private LocalDateTime dataArrivo;

	@ManyToOne
	private Aeroporto aeroportoArrivo;
	@ManyToOne
	private Aeroporto aeroportoPartenza;

	@OneToMany(mappedBy = "volo")
	private List<Prenotazione> prenotazioni;

	@OneToMany()
	private List<Aeroporto> aeroporti;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataPartenza() {
		return dataPartenza;
	}

	public void setDataPartenza(LocalDateTime dataPartenza) {
		this.dataPartenza = dataPartenza;
	}

	public LocalDateTime getDataArrivo() {
		return dataArrivo;
	}

	public void setDataArrivo(LocalDateTime dataArrivo) {
		this.dataArrivo = dataArrivo;
	}

	public Aeroporto getAeroportoArrivo() {
		return aeroportoArrivo;
	}

	public void setAeroportoArrivo(Aeroporto aeroportoArrivo) {
		this.aeroportoArrivo = aeroportoArrivo;
	}

	public Aeroporto getAeroportoPartenza() {
		return aeroportoPartenza;
	}

	public void setAeroportoPartenza(Aeroporto aeroportoPartenza) {
		this.aeroportoPartenza = aeroportoPartenza;
	}

	@Override
	public String toString() {
		return "Volo [id=" + id + ", dataPartenza=" + dataPartenza + ", dataArrivo=" + dataArrivo + ", aeroportoArrivo="
				+ aeroportoArrivo + ", aeroportoPartenza=" + aeroportoPartenza + "]";
	}

}
