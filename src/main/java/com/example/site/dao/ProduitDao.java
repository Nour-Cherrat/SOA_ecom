package com.example.site.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.site.bean.Produit;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {

	public Produit findByRef(String ref);

}
