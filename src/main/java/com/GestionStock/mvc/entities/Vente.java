package com.GestionStock.mvc.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Vente implements Serializable {
	@Id
	@GeneratedValue
   private Long idVente  ; 
	private String codeVente  ; 
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateVente ; 
	@OneToMany(mappedBy="vente")
	private List<LigneVente> ligneVentes ;
	public Vente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdVente() {
		return idVente;
	}
	public void setIdVente(Long idVente) {
		this.idVente = idVente;
	}
	public String getCodeVente() {
		return codeVente;
	}
	public void setCodeVente(String codeVente) {
		this.codeVente = codeVente;
	}
	public Date getDateVente() {
		return dateVente;
	}
	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}
	public List<LigneVente> getLigneVentes() {
		return ligneVentes;
	}
	public void setLigneVentes(List<LigneVente> ligneVentes) {
		this.ligneVentes = ligneVentes;
	} 
	

}
