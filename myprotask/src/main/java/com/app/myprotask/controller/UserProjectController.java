package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.UserProject;
import com.app.myprotask.model.dao.DAOService;

/**
 * @author Alejandro
 */
@RestController
@RequestMapping(value = "api/userProject")
public class UserProjectController {
	@Autowired
	DAOService daoS;
	
	
	/**
	 * Used in History [ User ]
	 * 
	 * @author Manuel
	 * @param idUser
	 * @return a list of users and projects based on the projects in which a user participates and where the project is active
	 */
	@GetMapping(value = "/displayUserProjectByActiveProjectByIdUser")
	public List<UserProject> displayUserProjectByActiveProjectByIdUser(@RequestParam("idUser") Long idUser) {
		return daoS.displayUserProjectByActiveProjectByIdUser(idUser);
	}
	

	/**
	 * Used in ? [ ? ]
	 * 
	 * Update the user project data to true or false depending on which one it has, and if the validations are valid 
	 * 
	 * @author Manuel
	 * @param idUserProject
	 */
	@PutMapping(value = "/updateActiveUserProjectById")
	public void updateActiveUserProjectById(@RequestParam("idUserProject") Long idUserProject) {
		daoS.updateActiveUserProject(daoS.displayUserProjectById(idUserProject));
	}
	
	/**
	 * Used in History [ User ]
	 * 
	 * @author Manuel
	 * @param idUser
	 * @return all user projects with user id
	 */
	@GetMapping(value = "/displayUserProjectByIdUser")
	public List<UserProject> displayUserProjectByIdUser(@RequestParam("idUser") Long idUser) {
		return daoS.displayUserProjectByIdUser(idUser);
	}

	/**
	 * Used in Users [ Admin ]
	 * 
	 * @author Alejandro
	 * @return all users and all active projects ordered by active members
	 */
	@GetMapping(value = "/displayActiveUserProject")
	public List<UserProject> displayActiveUserProject() {
		return daoS.displayActiveUserProject();
	}

	/**
	 * Used in Users [ User ]
	 * 
	 * @author Alejandro
	 * @param idUser
	 * @return all users and all active projects from one user ordered by active
	 *         members
	 */
	@GetMapping(value = "/displayActiveUserProjectByIdUser")
	public List<UserProject> displayActiveUserProjectByIdUser(@RequestParam("idUser") Long idUser) {
		return daoS.displayActiveUserProjectByIdUser(idUser);
	}

}