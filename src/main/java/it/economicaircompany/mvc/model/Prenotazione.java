
package it.economicaircompany.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Prenotazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String codice;

	@Column(nullable = false)
	private String codicePosto;

	@Column(nullable = false)
	private double costoBiglietto;

	@Column(nullable = false)
	private String descrizione;

	@ManyToOne
	private Volo volo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getCodicePosto() {
		return codicePosto;
	}

	public void setCodicePosto(String codicePosto) {
		this.codicePosto = codicePosto;
	}

	public double getCostoBiglietto() {
		return costoBiglietto;
	}

	public void setCostoBiglietto(double costoBiglietto) {
		this.costoBiglietto = costoBiglietto;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Volo getVolo() {
		return volo;
	}

	public void setVolo(Volo volo) {
		this.volo = volo;
	}

	@Override
	public String toString() {
		return "Prenotazione [id=" + id + ", codice=" + codice + ", codicePosto=" + codicePosto + ", costoBiglietto="
				+ costoBiglietto + ", descrizione=" + descrizione + ", volo=" + volo + "]";
	}

}
