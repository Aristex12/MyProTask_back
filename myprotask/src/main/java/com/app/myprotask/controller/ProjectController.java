package com.app.myprotask.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.Characteristic;
import com.app.myprotask.model.Project;
import com.app.myprotask.model.dao.DAOService;

/**
 * @author Manuel
 */
@RestController
@RequestMapping(value = "api/project")
public class ProjectController {

	@Autowired
	DAOService daoS;

	/**
	 * Create a new project
	 * 
	 * @author Manuel
	 * @param project
	 */
	@PostMapping(value = "/addProject")
	public ResponseEntity<?> addProject(@RequestParam("name") String name,
	                                    @RequestParam("description") String description,
	                                    @RequestParam(value = "finishDate", required = false) Date finishDate,
	                                    @RequestParam("vacancies") int vacancies,
	                                    @RequestBody List<Long> characteristicsIds) {
	    try {
	        if (name == null || name.isEmpty()) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Name cannot be null or empty.");
	        }

	        if (description == null || description.isEmpty()) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Description cannot be null or empty.");
	        }

	        if (vacancies <= 0) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Vacancies must be greater than 0.");
	        }

	        List<Characteristic> projectCharacteristics = new ArrayList<>();
	        for (Long idCharacteristic : characteristicsIds) {
	            Characteristic characteristic = daoS.displayCharacteristicById(idCharacteristic);
	            if (characteristic == null) {
	                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Characteristic with ID " + idCharacteristic + " not found.");
	            }
	            projectCharacteristics.add(characteristic);
	        }

	        Project projectNew = new Project(name, description, null, vacancies, projectCharacteristics);

	        if (finishDate != null) {
	            projectNew.setFinishDate(finishDate);
	        }

	        daoS.addProject(projectNew);
	        return ResponseEntity.status(HttpStatus.OK).body(projectNew.getIdProject());
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                             .body("An error occurred while adding the project: " + e.getMessage());
	    }
	}


	/**
	 * @author Manuel
	 * @param idUser
	 * @return List of all projects of a specific user when user project is active
	 */
	@GetMapping(value = "/displayProjectsByActiveUserProjectsByIdUser")
	public ResponseEntity<?> displayProjectsByActiveUserProjectsByIdUser(@RequestParam("idUser") Long idUser) {
		try {
			List<Project> projects = daoS.displayProjectsByActiveUserProjectsByIdUser(idUser);
			if (!projects.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(projects);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("No projects found for active user projects by user with ID: " + idUser);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while displaying projects by active user projects for user with ID "
							+ idUser + ": " + e.getMessage());
		}
	}

	/**
	 * Used in Search Project [ User ]
	 * 
	 * @author Manuel
	 * @param characteristics
	 * @return List of projects with the specific characteristics
	 */
	@PostMapping(value = "/searchProjectsByCharacteristics")
	public ResponseEntity<?> searchProjectsByCharacteristics(@RequestBody List<Long> characteristicsIds) {
		try {
			List<Project> projects = daoS.searchProjectsByCharacteristics(characteristicsIds,
					characteristicsIds.size());
			return ResponseEntity.status(HttpStatus.OK).body(projects);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while searching projects by characteristics: " + e.getMessage());
		}
	}

	/**
	 * Used in Project [ Admin, Manager ]
	 *
	 * Update the project's status to active or inactive and their participation in
	 * the project - user accordingly
	 * 
	 * @author Manuel
	 */
	@PutMapping(value = "/updateActiveProjectById")
	public ResponseEntity<String> updateActiveProjectById(@RequestParam("idProject") Long idProject) {
		try {
			daoS.updateActiveProject(daoS.displayProjectById(idProject));
			return ResponseEntity.status(HttpStatus.OK).body("Project updated successfully");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while updating the active project: " + e.getMessage());
		}
	}

	/**
	 * Used in NewProject view [ User, Member ]
	 *
	 * @author Alejandro
	 * @return List of all projects
	 */
	@GetMapping(value = "/displayProjects")
	public ResponseEntity<?> displayProjects() {
		try {
			List<Project> projects = daoS.displayProjects();
			if (!projects.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(projects);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No projects found");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while displaying projects: " + e.getMessage());
		}
	}

	/**
	 * Used in User view [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return a specific project
	 */
	@GetMapping(value = "/displayProjectById")
	public ResponseEntity<?> displayProjectById(@RequestParam("idProject") Long idProject) {
		try {
			Project project = daoS.displayProjectById(idProject);
			if (project != null) {
				return ResponseEntity.status(HttpStatus.OK).body(project);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Project not found");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while displaying the project: " + e.getMessage());
		}
	}

	/**
	 * Used in Home view [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return List of active projects of the user
	 */
	@GetMapping(value = "/displayActiveProjectsByIdUser")
	public ResponseEntity<?> displayActiveProjectsByIdUser(@RequestParam("idUser") Long idUser) {
		try {
			List<Project> projects = daoS.displayActiveProjectsByIdUser(idUser);
			if (!projects.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(projects);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("No active projects found for user with ID " + idUser);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while displaying active projects for user with ID " + idUser + ": "
							+ e.getMessage());
		}
	}

	/**
	 * Used in Calendar view [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return List of inactive projects of the user
	 */
	@GetMapping(value = "/displayInactiveProjectsByIdUser")
	public ResponseEntity<?> displayInactiveProjectsByIdUser(@RequestParam("idUser") Long idUser) {
		try {
			List<Project> projects = daoS.displayInactiveProjectsByIdUser(idUser);
			if (!projects.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(projects);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("No inactive projects found for user with ID " + idUser);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while displaying inactive projects for user with ID " + idUser + ": "
							+ e.getMessage());
		}
	}

	/**
	 * Used in History view [Member, Manager]
	 * 
	 * @author Alejandro
	 * @param idUser
	 * @return List of all projects of a specific user
	 */
	@GetMapping(value = "/displayProjectsByIdUser")
	public ResponseEntity<?> displayProjectsByIdUser(@RequestParam("idUser") Long idUser) {
		try {
			List<Project> projects = daoS.displayProjectsByIdUser(idUser);
			if (!projects.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(projects);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No projects found for user with ID " + idUser);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
					"An error occurred while displaying projects for user with ID " + idUser + ": " + e.getMessage());
		}
	}

}
