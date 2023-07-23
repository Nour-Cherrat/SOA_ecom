package com.example.site.bean;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	private String prenom;
	private String adresse;
	private String ville;
	private String numTel;
	private String email;
	private String password;
	private boolean isAdmin;
	
	@OneToMany(mappedBy = "user")
	private List<Facture> factures;
	
	

	
}
