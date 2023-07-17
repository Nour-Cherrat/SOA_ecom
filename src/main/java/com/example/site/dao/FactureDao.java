package com.example.site.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.site.bean.Facture;

@Repository
public interface FactureDao extends JpaRepository<Facture, Long> {

	public Facture findByRef(String ref);

}
