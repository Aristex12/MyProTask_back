package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.app.myprotask.model.User;
import com.app.myprotask.model.dao.DAOService;

/**
 * @author Alejandro
 */
@RestController
@RequestMapping(value = "api/user")
public class UserController {

	@Autowired
	BCryptPasswordEncoder passwordEncoder; // Inyectar BCryptPasswordEncoder

	@Autowired
	DAOService daoS;

	/**
	 * Used in Search User [ Manager ]
	 * 
	 * @author Alejandro
	 * @param characteristics
	 * @return List of users with the specific characteristics
	 */
	@PostMapping(value = "/searchUsersByCharacteristics")
	public List<User> searchUsersByCharacteristics(@RequestBody List<Long> characteristicsIds) {
		return daoS.searchUsersByCharacteristics(characteristicsIds, characteristicsIds.size());
	}

	/**
	 * Used in ? [ Admin ]
	 *
	 * Update the user's status to active or inactive and their participation in the
	 * project accordingly
	 * 
	 * @author Manuel
	 */
	@PutMapping(value = "/updateActiveUser")
	public void updateActiveUser(@RequestParam("idUser") Long idUser) {
		try {
			daoS.updateActiveUser(daoS.displayUserById(idUser));
		} catch (Exception e) {
			throw new RuntimeException("The user entered does not exist in the database", e);
		}
	}

	/**
	 * Used in Profile view [User]
	 * 
	 * @author Alejandro
	 * @param idUser
	 * @return All the objct of an specific user
	 */
	@GetMapping(value = "/displayUserById")
	public User displayUserById(@RequestParam("idUser") Long idUser) {
		return daoS.displayUserById(idUser);
	}

	@GetMapping(value = "/searchUserByEmailPassword")
	public Long searchUserByEmailPassword(@RequestParam("email") String email,
			@RequestParam("password") String password) {
		return daoS.searchUserByEmailPassword(email, password);
	}

	/**
	 * Used in register view [ Admin ]
	 * 
	 * Inserts a new user with data received from the form, here we will
	 * automatically generate the DAS and email
	 *
	 * @author Manuel
	 * @param user
	 */
	@PostMapping(value = "/addUser")
	public void addUser(@RequestParam("name") String name, @RequestParam("lastName") String lastName) {

		daoS.addUser(new User(name, lastName, passwordEncoder.encode("Abcdefg1!"), daoS.getRoleByName("employee")));
	}

	/**
	 * Used in EditUser [ User ]
	 * 
	 * Updates the introduced user with the new data
	 * 
	 * @author Manuel
	 * @param idUser
	 * @param userCharacteristics
	 */
	@PutMapping(value = "/updateCvProfilePicUserById")
	public void updateCvProfilePicUserById(@RequestParam("idUser") Long idUser, @RequestParam("cv") String cv,
			@RequestParam("profilePic") String profilePic) {

		User user = daoS.displayUserById(idUser);

		user.setCv(cv);
		user.setProfilePic(profilePic);

		daoS.updateUser(user);
	}

	/**
	 * Used in EditUser [ User ]
	 * 
	 * Updates the introduced user with the new password
	 * 
	 * @author Alejandro
	 * @param idUser
	 * @param password
	 */
	@PutMapping(value = "/updatePasswordUserById")
	public void updatePasswordUserById(@RequestParam("idUser") Long idUser, @RequestParam("password") String password) {

		User user = daoS.displayUserById(idUser);

		user.setPassword(passwordEncoder.encode(password));

		daoS.updateUser(user);
	}

}
