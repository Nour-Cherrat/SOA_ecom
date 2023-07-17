package com.example.site.service;

import java.util.List;

import com.example.site.bean.User;

public interface UserService {

	public void save(User user);
	public List<User> findAll();
	public User findByVille(String ville);
	
}
