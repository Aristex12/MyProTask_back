package com.app.myprotask.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
import com.app.myprotask.model.UserProject;
import com.app.myprotask.model.dao.DAOService;
 
/**
* @author Alejandro
*/
@RestController
@RequestMapping(value = "api/userProject")
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET,
		RequestMethod.DELETE })
public class UserProjectController {
	@Autowired
	DAOService daoS;
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
	 * @return all users and all active projects from one user ordered by active members
	 */
	@GetMapping(value = "/displayActiveUserProjectByUserId")
	public List<UserProject> displayActiveUserProjectByUserId(@RequestParam("idUser") Long idUser) {
		return daoS.displayActiveUserProjectByUserId(idUser);
	}

 
}