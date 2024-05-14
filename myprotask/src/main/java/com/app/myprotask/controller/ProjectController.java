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
	 * Used in NewProject view
	 * 
	 * @author Alejandro
	 * @return List of all projects
	 */
	@GetMapping(value = "/displayProjects")
	public List<Project> displayProjects() {
		return daoS.displayProjects();
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
}