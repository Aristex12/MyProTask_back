package com.app.myprotask.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	@GetMapping(value = "/displayActiveProjectsByUserId")
	public List<Project> displayActiveProjectsByUserId(@RequestParam("idUser") Long idUser) {
		return daoS.displayActiveProjectsByUserId(idUser);
	}
 
	/**
	 * Used in Calendar view [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return List of inactive projects of the user
	 */
	@GetMapping(value = "/displayInactiveProjectsByUserId")
	public List<Project> displayInactiveProjectsByUserId(@RequestParam("idUser") Long idUser) {
		return daoS.displayInactiveProjectsByUserId(idUser);
	}
}