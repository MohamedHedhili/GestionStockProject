package com.GestionStock.mvc.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MouvementStock implements Serializable{
	public static final int ENTREE =1 ; 
	public static final int SORTIE =2 ;
	@Id
	@GeneratedValue
	private Long idMvtStk ; 
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMouvement ; 
	private BigDecimal quantite ; 
	private int typeMvt ;
	@ManyToOne
	@JoinColumn(name="idArticle")
	public Article  article  ; 
	
	public MouvementStock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdMvtStk() {
		return idMvtStk;
	}
	public void setIdMvtStk(Long idMvtStk) {
		this.idMvtStk = idMvtStk;
	}
	public Date getDateMouvement() {
		return dateMouvement;
	}
	public void setDateMouvement(Date dateMouvement) {
		this.dateMouvement = dateMouvement;
	}
	public BigDecimal getQuantite() {
		return quantite;
	}
	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}
	public int getTypeMvt() {
		return typeMvt;
	}
	public void setTypeMvt(int typeMvt) {
		this.typeMvt = typeMvt;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	} 

}
