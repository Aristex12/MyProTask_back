package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.Task;
import com.app.myprotask.model.dao.DAOService;

/**
 * @author Alejandro
 */
@RestController
@RequestMapping(value = "api/task")
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET,
		RequestMethod.DELETE })
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
	@GetMapping(value = "/displayActiveTasksActiveProjectByUserId")
	public List<Task> displayActiveTasksActiveProjectByUserId(@RequestParam("idUser") Long idUser) {
		return daoS.displayActiveTasksActiveProjectByUserId(idUser);
	}

	/**
	 * Used in calendar view [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return lists of all tasks of the user ordered by projects
	 */
	@GetMapping(value = "/displayTasksByUserId")
	public List<Task> displayTasksByUserId(@RequestParam("idUser") Long idUser) {
		return daoS.displayTasksByUserId(idUser);
	}

	/**
	 * Used in Home view [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return List of tasks of the user
	 */
	@GetMapping(value = "/displayActiveTasksByUserId")
	public List<Task> displayActiveTasksByUserId(@RequestParam("idUser") Long idUser) {
		return daoS.displayActiveTasksByUserId(idUser);
	}

	/**
	 * Used in Home view [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return List of tasks of the project
	 */
	@GetMapping(value = "/displayTasksByProjectId")
	public List<Task> displayActiveTasksByProjectId(@RequestParam("idProject") Long idProject) {
		return daoS.displayActiveTasksByProjectId(idProject);
	}

}