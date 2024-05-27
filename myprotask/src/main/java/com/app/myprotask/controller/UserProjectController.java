package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<?> displayUserProjectByActiveProjectByIdUser(@RequestParam("idUser") Long idUser) {
        try {
            List<UserProject> userProjects = daoS.displayUserProjectByActiveProjectByIdUser(idUser);
            return ResponseEntity.status(HttpStatus.OK).body(userProjects);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while retrieving user projects");
        }
    }

	/**
	 * 
	 * Update the user project data to true or false depending on which one it has, and if the validations are valid 
	 * 
	 * @author Manuel
	 * @param idUserProject
	 */
	@PutMapping(value = "/updateActiveUserProjectById")
	public ResponseEntity<String> updateActiveUserProjectById(@RequestParam("idUserProject") Long idUserProject) {
	    try {
	        daoS.updateActiveUserProject(daoS.displayUserProjectById(idUserProject));
	        return ResponseEntity.status(HttpStatus.OK).body("User project isActive updated successfully");
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while updating user project");
	    }
	}

	
	/**
	 * Used in History [ User ]
	 * 
	 * @author Manuel
	 * @param idUser
	 * @return all user projects with user id
	 */
	@GetMapping(value = "/displayUserProjectByIdUser")
	public ResponseEntity<?> displayUserProjectByIdUser(@RequestParam("idUser") Long idUser) {
	    try {
	        List<UserProject> userProjects = daoS.displayUserProjectByIdUser(idUser);
	        return ResponseEntity.status(HttpStatus.OK).body(userProjects);
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                             .body("An error occurred while displaying user projects by user ID: " + idUser + e.getMessage());
	    }
	}


	/**
	 * Used in Users [ Admin ]
	 * 
	 * @author Alejandro
	 * @return all users and all active projects ordered by active members
	 */
	@GetMapping(value = "/displayActiveUserProject")
	public ResponseEntity<?> displayActiveUserProject() {
	    try {
	        List<UserProject> activeUserProjects = daoS.displayActiveUserProject();
	        return ResponseEntity.status(HttpStatus.OK).body(activeUserProjects);
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                             .body("An error occurred while displaying active user projects: " + e.getMessage());
	    }
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
	public ResponseEntity<?> displayActiveUserProjectByIdUser(@RequestParam("idUser") Long idUser) {
	    try {
	        List<UserProject> activeUserProjects = daoS.displayActiveUserProjectByIdUser(idUser);
	        return ResponseEntity.status(HttpStatus.OK).body(activeUserProjects);
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                             .body("An error occurred while displaying active user projects for user with ID " + idUser + ": " + e.getMessage());
	    }
	}


}