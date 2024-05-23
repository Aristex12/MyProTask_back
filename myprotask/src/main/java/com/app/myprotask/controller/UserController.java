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

    @Autowired
    BCryptPasswordEncoder passwordEncoder;  // Inyectar BCryptPasswordEncoder

    @GetMapping(value = "/displayUserById")
    public User displayUserById(@RequestParam("idUser") Long idUser) {
        return daoS.displayUserById(idUser);
    }

    @GetMapping(value = "/searchUserByEmailPassword")
    public Long searchUserByEmailPassword(@RequestParam("email") String email,
                                          @RequestParam("password") String password) {
        return daoS.searchUserByEmailPassword(email, password);
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
