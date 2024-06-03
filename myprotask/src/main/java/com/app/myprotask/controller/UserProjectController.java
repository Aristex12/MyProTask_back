package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.Project;
import com.app.myprotask.model.Role;
import com.app.myprotask.model.User;
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
	 * @author Manuel
	 * @param idUser
	 * @param idProject
	 * @return id_user_project by user and project
	 */
	@GetMapping(value = "/displayIdUserProjectByIdUserIdProject")
	public ResponseEntity<?> displayIdUserProjectByIdUserIdProject(@RequestParam("idUser") Long idUser, 
	                                                               @RequestParam("idProject") Long idProject) {
	    try {
	        Long idUserProject = daoS.displayIdUserProjectByIdUserIdProject(idUser, idProject);
	        if (idUserProject != null) {
	            return ResponseEntity.status(HttpStatus.OK).body(idUserProject);
	        } else {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No UserProject found for user ID: " + idUser + " and project ID: " + idProject);
	        }
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                             .body("An error occurred while retrieving the UserProject ID: " + e.getMessage());
	    }
	}


	/**
	 * Insert a user into a project as a member
	 * 
	 * @param idUser
	 * @param idProject
	 * @return ResponseEntity with status and message
	 */
	@PostMapping(value = "/addMember")
	public ResponseEntity<String> addMember(@RequestParam("idUser") Long idUser,
			@RequestParam("idProject") Long idProject) {
		return addUserProject(idUser, idProject, 4L);
	}

	/**
	 * Insert a user into a project as a manager
	 * 
	 * @param idUser
	 * @param idProject
	 * @return ResponseEntity with status and message
	 */
	@PostMapping(value = "/addManager")
	public ResponseEntity<String> addManager(@RequestParam("idUser") Long idUser,
			@RequestParam("idProject") Long idProject) {
		return addUserProject(idUser, idProject, 3L);
	}

	private ResponseEntity<String> addUserProject(Long idUser, Long idProject, Long idRole) {
		try {
			User user = daoS.displayUserById(idUser);
			Project project = daoS.displayProjectById(idProject);
			Role role = daoS.displayRoleById(idRole);

			if (user != null) {
				if (project != null) {
					daoS.addUserProject(new UserProject(user, project, role));
					return ResponseEntity.status(HttpStatus.OK).body("User added as a " + role.getName());
				} else {
					return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Project not found");
				}
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Internal server error: " + e.getMessage());
		}
	}

	/**
	 * @author Manuel
	 * @param idProject
	 * @return all active users projects of project
	 */
	@GetMapping(value = "/displayActiveUserProjectByIdProject")
	public ResponseEntity<?> displayActiveUserProjectByIdProject(@RequestParam("idProject") Long idProject) {
		try {
			List<UserProject> activeUserProjects = daoS.displayActiveUserProjectByIdProject(idProject);
			if (!activeUserProjects.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(activeUserProjects);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("No active user projects found for project with ID: " + idProject);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while displaying active user projects for project with ID " + idProject
							+ ": " + e.getMessage());
		}
	}

	/**
	 * @author Manuel
	 * @param idProject
	 * @return count of active users projects of project
	 */
	@GetMapping(value = "/countActiveUserProjectByIdProject")
	public ResponseEntity<?> countActiveUserProjectByIdProject(@RequestParam("idProject") Long idProject) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(daoS.countActiveUserProjectByIdProject(idProject));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while counting user projects for project ID: " + idProject
							+ ". Error message: " + e.getMessage());
		}
	}

	/**
	 * Used in History [ User ]
	 * 
	 * @author Manuel
	 * @param idUser
	 * @return a list of users and projects based on the projects in which a user
	 *         participates and where the project is active
	 */
	@GetMapping(value = "/displayUserProjectByActiveProjectByIdUser")
	public ResponseEntity<?> displayUserProjectByActiveProjectByIdUser(@RequestParam("idUser") Long idUser) {
		try {
			List<UserProject> userProjects = daoS.displayUserProjectByActiveProjectByIdUser(idUser);
			if (!userProjects.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(userProjects);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("No user projects found for user with ID: " + idUser);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while retrieving user projects: " + e.getMessage());
		}
	}

	/**
	 * 
	 * Update the user project data to true or false depending on which one it has,
	 * and if the validations are valid
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
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while updating user project: " + e.getMessage());
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
			if (!userProjects.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(userProjects);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("No user projects found for user with ID: " + idUser);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while displaying user projects by user ID: " + idUser + ". Error message: "
							+ e.getMessage());
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
			if (!activeUserProjects.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(activeUserProjects);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No active user projects found");
			}
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
			if (!activeUserProjects.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(activeUserProjects);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("No active user projects found for user with ID " + idUser);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while displaying active user projects for user with ID " + idUser + ": "
							+ e.getMessage());
		}
	}

}