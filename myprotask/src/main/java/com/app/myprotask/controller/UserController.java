package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.User;
import com.app.myprotask.model.dao.DAOService;


/**
 * @author Alejandro
 */
@RestController
@RequestMapping(value = "api/user")
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET,
		RequestMethod.DELETE })
public class UserController {

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
	 * Update the user's status to active or inactive and their participation in the project accordingly
	 * 
	 * @author Manuel
	 */
	@PutMapping(value = "/updateActiveUser")
	public void updateActiveUser(@RequestParam("idUser") Long idUser) {	
		daoS.updateActiveUser(daoS.displayUserById(idUser));
	}

	/**
	 * Used in Users [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return a specific user
	 */
	@GetMapping(value = "/displayUserById")
	public User displayUserById(@RequestParam("idUser") Long idUser) {
		return daoS.displayUserById(idUser);
	}

	/**
	 * Used in Log in view [ All ]
	 *
	 * @author Alejandro
	 * @param email
	 * @param password
	 * @return long of the user if exist
	 */
	@GetMapping(value = "/searchUserByEmailPassword")
	public Long searchUserByEmailPassword(@RequestParam("email") String email,
			@RequestParam("password") String password) {
		return daoS.searchUserByEmailPassword(email, password);
	}

	/**
	 * Used in Log in view [ All ]
	 *
	 * @author Alejandro
	 * @param das
	 * @param password
	 * @return long of the user if exist
	 */
	@GetMapping(value = "/searchUserByDasPassword")
	public Long searchUserByDasPassword(@RequestParam("das") String das, @RequestParam("password") String password) {
		return daoS.searchUserByDasPassword(das, password);
	}

//	/**
//	 * Used in register view [ Admin ]
//	 * 
//	 * Inserts a new user with data received from the form, here we will
//	 * automatically generate the DAS and email
//	 *
//	 * @author Manuel
//	 * @param user
//	 */
//	@PostMapping(value = "/addUser")
//	public void addUser(@RequestBody User userData) {
//
//		List<Characteristic> userCharacteristics = new ArrayList<>();
//
//		// I create a list of characteristics by retrieving them using the obtained ID,
//		// and we add them to the user to be inserted
//		for (Characteristic c : userData.getUserCharacteristics()) {
//			userCharacteristics.add(daoS.displayCharacteristicById(c.getIdCharacteristic()));
//		}
//
//		daoS.addUser(new User(userData.getName(), userData.getLastName(), userData.getPassword(),
//				daoS.getRoleByName("employee"), userCharacteristics));
//	}

	/**
	 * Used in EditUser [ User ]
	 * 
	 * Updates the introduced user with the new data
	 * 
	 * @author Manuel
	 * @param idUser
	 * @param userCharacteristics
	 */
	@PutMapping(value = "/updateUserByIdUser")
	public void updateUserByIdUser(@RequestParam("idUser") Long idUser, @RequestParam("cv") String cv, @RequestParam("profilePic") String profilePic) {

		User user = daoS.displayUserById(idUser);

		user.setCv(cv);
		user.setProfilePic(profilePic);

		daoS.updateUser(user);
	}
	
	

}