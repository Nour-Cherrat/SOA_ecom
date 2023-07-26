package com.example.site.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Facture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ref;
	private Date date;
	private double montantHT;
	private double montantTTC;
	private int tva;
	
	@ManyToOne
	private User user;
	
	@ManyToMany
	@JoinTable(
			name = "facture_produit",
			joinColumns = @JoinColumn(name = "facture_id"),
			inverseJoinColumns = @JoinColumn(name = "produit_id")
	)
	private ArrayList<Produit> produits;
	
	


	
}
