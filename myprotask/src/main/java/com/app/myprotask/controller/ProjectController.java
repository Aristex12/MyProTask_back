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

import com.app.myprotask.model.Project;
import com.app.myprotask.model.dao.DAOService;

/**
 * @author Manuel
 */
@RestController
@RequestMapping(value = "api/project")
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET,
		RequestMethod.DELETE })
public class ProjectController {

	@Autowired
	DAOService daoS;
	
	/**
	 * Used in Search Project [ User ]
	 * 
	 * @author Manuel
	 * @param characteristics
	 * @return List of projects with the specific characteristics
	 */
	@PostMapping(value = "/searchProjectsByCharacteristics")
    public List<Project> searchProjectsByCharacteristics(@RequestBody List<Long> characteristicsIds) {
        return daoS.searchProjectsByCharacteristics(characteristicsIds, characteristicsIds.size());
    }

	/**
	 * Used in Project [ Admin, Manager ]
	 *
	 * Update the project's status to active or inactive and their participation in the project - user accordingly
	 * 
	 * @author Manuel
	 */
	@PutMapping(value = "/updateActiveProjectById")
	public void updateActiveProjectById(@RequestParam("idProject") Long idProject) {
		daoS.updateActiveProject(daoS.displayProjectById(idProject));
	}

	/**
	 * Used in NewProject view [ User, Member ]
	 *
	 * @author Alejandro
	 * @return List of all projects
	 */
	@GetMapping(value = "/displayProjects")
	public List<Project> displayProjects() {
		return daoS.displayProjects();
	}

	/**
	 * Used in User view [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return a specific project
	 */
	@GetMapping(value = "/displayProjectById")
	public Project displayProjectById(@RequestParam("idProject") Long idProject) {
		return daoS.displayProjectById(idProject);
	}

	/**
	 * Used in Home view [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return List of active projects of the user
	 */
	@GetMapping(value = "/displayActiveProjectsByIdUser")
	public List<Project> displayActiveProjectsByIdUser(@RequestParam("idUser") Long idUser) {
		return daoS.displayActiveProjectsByIdUser(idUser);
	}

	/**
	 * Used in Calendar view [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return List of inactive projects of the user
	 */
	@GetMapping(value = "/displayInactiveProjectsByIdUser")
	public List<Project> displayInactiveProjectsByIdUser(@RequestParam("idUser") Long idUser) {
		return daoS.displayInactiveProjectsByIdUser(idUser);
	}
}
