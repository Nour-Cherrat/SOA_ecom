package com.example.site.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.site.bean.User;
import com.example.site.service.UserService;

@RestController
@RequestMapping("/ecom-api/user")
public class UserRest {
	
	@Autowired
	private UserService userService;

	@PostMapping("/")
	public void save(@RequestBody User user) {
		userService.save(user);
	}

	@GetMapping("/")
	public List<User> findAll() {
		return userService.findAll();
	}
	
	@GetMapping("/ville/{ville}")
	public User findByVille(@PathVariable String ville) {
		return userService.findByVille(ville);
	} 
	

}
