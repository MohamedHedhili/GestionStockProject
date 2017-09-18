package com.GestionStock.mvc.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Article implements Serializable {
    @Id
    @GeneratedValue
	private  long idArticle  ;
    private String codeArticle ; 
    private String designation ;  
    private BigDecimal prixUnitHt  ; 
    private BigDecimal tauxTva ; 
    private BigDecimal prixUnitTTc  ; 
    private String photo  ;
    @ManyToOne
    @JoinColumn(name="idCategorie")
    private Categorie categorie ;
    @OneToMany(mappedBy="article")
    private List<LigneCommandeClient> ligneCommandeClients  ; 
    @OneToMany(mappedBy="article")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs  ; 
    @OneToMany(mappedBy="article")
    private List <LigneVente> ligneVentes ; 
    @OneToMany(mappedBy="article")
    private List <MouvementStock> mouvementStocks ; 
    
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(long idArticle) {
		this.idArticle = idArticle;
	}
	public String getCodeArticle() {
		return codeArticle;
	}
	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public BigDecimal getPrixUnitHt() {
		return prixUnitHt;
	}
	public void setPrixUnitHt(BigDecimal prixUnitHt) {
		this.prixUnitHt = prixUnitHt;
	}
	public BigDecimal getTauxTva() {
		return tauxTva;
	}
	public void setTauxTva(BigDecimal tauxTva) {
		this.tauxTva = tauxTva;
	}
	public BigDecimal getPrixUnitTTc() {
		return prixUnitTTc;
	}
	public void setPrixUnitTTc(BigDecimal prixUnitTTc) {
		this.prixUnitTTc = prixUnitTTc;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public List<LigneCommandeClient> getLigneCommandeClients() {
		return ligneCommandeClients;
	}
	public void setLigneCommandeClients(List<LigneCommandeClient> ligneCommandeClients) {
		this.ligneCommandeClients = ligneCommandeClients;
	}
	public List<LigneCommandeFournisseur> getLigneCommandeFournisseurs() {
		return ligneCommandeFournisseurs;
	}
	public void setLigneCommandeFournisseurs(List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
		this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
	}
	public List<LigneVente> getLigneVentes() {
		return ligneVentes;
	}
	public void setLigneVentes(List<LigneVente> ligneVentes) {
		this.ligneVentes = ligneVentes;
	}
	public List<MouvementStock> getMouvementStocks() {
		return mouvementStocks;
	}
	public void setMouvementStocks(List<MouvementStock> mouvementStocks) {
		this.mouvementStocks = mouvementStocks;
	} 
    
    
}
