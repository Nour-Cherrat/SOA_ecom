package com.example.site.service;

import java.util.List;

import com.example.site.bean.Facture;

public interface FactureService {

	public void save(Facture facture);
	public List<Facture> findAll();
	public Facture findByRef(String ref);
	
}
