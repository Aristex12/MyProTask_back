package com.app.myprotask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.User;
import com.app.myprotask.model.dao.DAOService;

/**
 * @author Alejandro
 */
@RestController
@RequestMapping(value = "api/user")
public class UserController {
	
	@Autowired
	DAOService daoS;
	
	/**
	 * 
	 * @param email
	 * @param password
	 * @return long of the user if exist
	 */
	@GetMapping(value = "/searchUserByEmailPassword", produces = { "application/json" })
	public Long searchUserByEmailPassword(@RequestParam("email")String email, @RequestParam("password")String password) {
		return daoS.searchUserByEmailPassword(email, password);
	}
	
	
	/**
	 * Method that inserts a new user with their DAS and email
	 * 
	 * @author Manuel
	 * @param user
	 */
	@PostMapping(value = "/addUser")
	public void addUser(@RequestBody User user) {
		daoS.addUser(user);
	}
	

}
