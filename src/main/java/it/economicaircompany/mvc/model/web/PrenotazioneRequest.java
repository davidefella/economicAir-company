package it.economicaircompany.mvc.model.web;

import it.economicaircompany.mvc.model.Volo;

public class PrenotazioneRequest {

	private String id;
	private String codice;
	private String codicePosto;
	private String costoBiglietto;
	private String descrizione;
	private Volo volo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getCostoBiglietto() {
		return costoBiglietto;
	}

	public void setCostoBiglietto(String costoBiglietto) {
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
		return "PrenotazioneRequest [id=" + id + ", codice=" + codice + ", codicePosto=" + codicePosto
				+ ", costoBiglietto=" + costoBiglietto + ", descrizione=" + descrizione + ", volo=" + volo + "]";
	}
}
