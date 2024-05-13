package com.app.myprotask.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
import com.app.myprotask.model.Project;
import com.app.myprotask.model.Task;
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
	 * Used in Log in view
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
	 * Inserts a new user with data received from the form, here we will
	 * automatically generate the DAS and email Used in register view
	 * Used in Register view
	 * 
	 * @author Manuel
	 * @param user
	 */
	@PostMapping(value = "/addUser")
	public void addUser(@RequestBody User userData) {
		daoS.addUser(new User(userData.getName(), userData.getLastName(), userData.getPassword(),
				userData.getProfilePic(), null));
	}
 
	/**
	 * Used in Home view
	 *  
	 * @author Alejandro
	 * @param idUser
	 * @return List of projects of the user
	 */
	@GetMapping(value = "/displayProjectsByUserId")
	public List<Project> displayProjectsByUserId(@RequestParam("idUser") Long idUser) {
		return daoS.displayProjectsByUserId(idUser);
	}
 
	/**
	 * Used in Home view
	 * 
	 * @author Alejandro
	 * @param idUser
	 * @return List of tasks of the user
	 */
	@GetMapping(value = "/displayTasksByUserId")
	public List<Task> displayTasksByUserId(@RequestParam("idUser") Long idUser) {
		return daoS.displayTasksByUserId(idUser);
	}
	
 
}