package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.Task;
import com.app.myprotask.model.dao.DAOService;

/**
 * @author Alejandro
 */
@RestController
@RequestMapping(value = "api/task")
public class TaskController {

	@Autowired
	DAOService daoS;
	
	/**
	 * Used in View Tasks [ Member ]
	 * 
	 * @author Alejandro
	 * @param idUser
	 * @return all active tasks from actives projects of a user
	 */
	@GetMapping(value = "/displayActiveTasksActiveProjectByIdUser")
	public List<Task> displayActiveTasksActiveProjectByIdUser(@RequestParam("idUser") Long idUser) {
		return daoS.displayActiveTasksActiveProjectByIdUser(idUser);
	}

	/**
	 * Used in calendar view [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return lists of all tasks of the user ordered by projects
	 */
	@GetMapping(value = "/displayTasksByIdUser")
	public List<Task> displayTasksByIdUser(@RequestParam("idUser") Long idUser) {
		return daoS.displayTasksByIdUser(idUser);
	}

	/**
	 * Used in Home view [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return List of tasks of the user
	 */
	@GetMapping(value = "/displayActiveTasksByIdUser")
	public List<Task> displayActiveTasksByIdUser(@RequestParam("idUser") Long idUser) {
		return daoS.displayActiveTasksByIdUser(idUser);
	}

	/**
	 * Used in Home view [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return List of tasks of the project
	 */
	@GetMapping(value = "/displayActiveTasksByIdProject")
	public List<Task> displayActiveTasksByIdProject(@RequestParam("idProject") Long idProject) {
		return daoS.displayActiveTasksByIdProject(idProject);
	}
	
	/**
	 * Used in Home Project [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return Count all tasks of the project
	 */
	@GetMapping(value = "/countActiveTasksByIdProject")
	public Integer countActiveTasksByIdProject(@RequestParam("idProject") Long idProject) {
		return daoS.countActiveTasksByIdProject(idProject);
	}

}