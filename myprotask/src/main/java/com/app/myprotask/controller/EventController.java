package com.app.myprotask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.Event;
import com.app.myprotask.model.Project;
import com.app.myprotask.model.User;
import com.app.myprotask.model.dao.DAOService;

/**
 * @author Alejandro
 */
@RestController
@RequestMapping(value = "api/event")
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET,
		RequestMethod.DELETE })
public class EventController {
	
	@Autowired
	DAOService daoS;
	
	/**
	 * 
	 * @author Alejandro
	 * @param idEvent
	 * @return all events of a specific user
	 */
	@GetMapping(value = "/displayEventsByIdUser")
	public Project displayEventsByIdUser(@RequestParam("idEvent") Long idEvent) {
		return daoS.displayEventsByIdUser(idEvent);
	}
	
	/**
	 * Add one event of a specific user
	 * 
	 * @author Alejandro
	 * @param idEvent
	 * @return 
	 */
	@PostMapping(value = "/addEvent")
	public void addEventByIdUser(@RequestBody Event event) {

		daoS.addEvent(event);
	}
	
	@DeleteMapping(value = "/deleteEventByIdUser")
	public void deleteEventByIdUser(@RequestBody Event event) {

		
		daoS.deleteEvent(event);
	}
	
	

}
