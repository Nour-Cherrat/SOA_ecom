package com.example.site.bean;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Facture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ref;
	private Date date;
	private BigDecimal montantHT;
	private BigDecimal montantTTC;
	private int tva;
	
	@ManyToOne
	private User user;
	
	@ManyToMany
	@JoinTable(
			name = "productBought",
			joinColumns = @JoinColumn(name = "facture_id"),
			inverseJoinColumns = @JoinColumn(name = "produit_id"))
	private Produit produit;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getMontantHT() {
		return montantHT;
	}

	public void setMontantHT(BigDecimal montantHT) {
		this.montantHT = montantHT;
	}

	public BigDecimal getMontantTTC() {
		return montantTTC;
	}

	public void setMontantTTC(BigDecimal montantTTC) {
		this.montantTTC = montantTTC;
	}

	public int getTva() {
		return tva;
	}

	public void setTva(int tva) {
		this.tva = tva;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	
	
	
	
}
