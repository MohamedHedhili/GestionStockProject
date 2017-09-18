package com.GestionStock.mvc.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class CommandeFournisseur implements Serializable {
	
	@Id
	@GeneratedValue
	private Long  idComandeFournisseur ;
	private String  code  ; 
	@Temporal(TemporalType.TIMESTAMP)
	private Date  date;
	@ManyToOne
	@JoinColumn(name="idFournisseur")
	private Fournisseur fournisseur ;
	@OneToMany(mappedBy="commandeFournisseur")
	private List<LigneCommandeFournisseur> ligneCommandeFournisseurs  ;
	public CommandeFournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdComandeFournisseur() {
		return idComandeFournisseur;
	}
	public void setIdComandeFournisseur(Long idComandeFournisseur) {
		this.idComandeFournisseur = idComandeFournisseur;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public List<LigneCommandeFournisseur> getLigneCommandeFournisseurs() {
		return ligneCommandeFournisseurs;
	}
	public void setLigneCommandeFournisseurs(List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
		this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
	}
	
	
	

}
