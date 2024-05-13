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

	/**
	 * Used in Home view
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return List of tasks of the project
	 */
	@GetMapping(value = "/displayTasksByProjectId")
	public List<Task> displayTasksByProjectId(@RequestParam("idProject") Long idProject) {
		return daoS.displayTasksByProjectId(idProject);
	}

}
