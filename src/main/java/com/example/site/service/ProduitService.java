package com.example.site.service;

import java.util.List;

import com.example.site.bean.Produit;

public interface ProduitService {

	public void save(Produit produit);
	public List<Produit> findAll();
	public Produit findByRef(String ref);
	
}
