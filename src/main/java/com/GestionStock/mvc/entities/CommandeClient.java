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
public class CommandeClient implements Serializable{
	@Id
	@GeneratedValue
	private Long  idComandeClient ;
	private String  code  ; 
	@Temporal(TemporalType.TIMESTAMP)
	private Date  date;
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client  ;
	@OneToMany(mappedBy="commandeClient")
	private List<LigneCommandeClient> ligneCommandeClients  ;

	public CommandeClient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdComandeClient() {
		return idComandeClient;
	}
	public void setIdComandeClient(Long idComandeClient) {
		this.idComandeClient = idComandeClient;
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
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<LigneCommandeClient> getLigneCommandeClients() {
		return ligneCommandeClients;
	}
	public void setLigneCommandeClients(List<LigneCommandeClient> ligneCommandeClients) {
		this.ligneCommandeClients = ligneCommandeClients;
	} 
	
	
	

}
