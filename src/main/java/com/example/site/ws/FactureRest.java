package com.example.site.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.site.bean.Facture;
import com.example.site.service.FactureService;

@RestController
@RequestMapping("/ecom-api/user")
public class FactureRest {
	
	@Autowired
	private FactureService factureService;

	@PostMapping("/")
	public void save(@RequestBody Facture facture) {
		factureService.save(facture);
	}

	@GetMapping("/")
	public List<Facture> findAll() {
		return factureService.findAll();
	}
	
	@GetMapping("/ref/{ref}")
	public Facture findByRef(@PathVariable String ref) {
		return factureService.findByRef(ref);
	} 
	

}
