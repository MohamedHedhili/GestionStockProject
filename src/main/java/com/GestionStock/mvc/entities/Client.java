package com.GestionStock.mvc.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client  implements Serializable{
	@Id
	@GeneratedValue
	private Long  idClient  ; 
	private String  nom ; 
	private String prenom  ; 
	private String adresse  ; 
	private String mail ; 
	private String photo  ;
	@OneToMany(mappedBy ="client")
	private List<CommandeClient> commandeClients ; 
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public List<CommandeClient> getCommandeClients() {
		return commandeClients;
	}
	public void setCommandeClients(List<CommandeClient> commandeClients) {
		this.commandeClients = commandeClients;
	}  
	

}
