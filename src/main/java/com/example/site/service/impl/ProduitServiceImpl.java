package com.example.site.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.site.bean.Produit;
import com.example.site.dao.ProduitDao;
import com.example.site.service.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService {
	
	@Autowired
	private ProduitDao produitDao;

	@Override
	public void save(Produit produit) {
		// TODO Auto-generated method stub
		produitDao.save(produit);
		
	}

	@Override
	public List<Produit> findAll() {
		// TODO Auto-generated method stub
		return produitDao.findAll();
	}

	@Override
	public Produit findByRef(String ref) {
		// TODO Auto-generated method stub
		return produitDao.findByRef(ref);
	}

}
