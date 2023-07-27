package com.example.site.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.site.bean.Produit;
import com.example.site.service.ProduitService;

@RestController
@RequestMapping("/ecom-api/produit")
public class ProduitRest {
	
	@Autowired
	private ProduitService produitService;

	@PostMapping("/")
	public void save(@RequestBody Produit produit) {
		produitService.save(produit);
	}

	@GetMapping("/")
	public List<Produit> findAll() {
		return produitService.findAll();
	}
	
	@GetMapping("/ref/{ref}")
	public Produit findByRef(@PathVariable String ref) {
		return produitService.findByRef(ref);
	} 
	

}
