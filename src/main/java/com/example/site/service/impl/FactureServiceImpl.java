package com.example.site.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.site.bean.Facture;
import com.example.site.dao.FactureDao;
import com.example.site.service.FactureService;

@Service
public class FactureServiceImpl implements FactureService {
	
	@Autowired
	private FactureDao factureDao;

	@Override
	public void save(Facture facture) {
		// TODO Auto-generated method stub
		factureDao.save(facture);
		
	}

	@Override
	public List<Facture> findAll() {
		// TODO Auto-generated method stub
		return factureDao.findAll();
	}

	@Override
	public Facture findByRef(String ref) {
		// TODO Auto-generated method stub
		return factureDao.findByRef(ref);
	}

}
