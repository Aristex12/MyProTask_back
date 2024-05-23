package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.Event;
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
	public List<Event> displayEventsByIdUser(@RequestParam("idEvent") Long idEvent) {
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
	public void addEvent(@RequestBody Event event) {
		daoS.addEvent(event);
	}
	
	@DeleteMapping(value = "/deleteEvent")
	public void deleteEvent(@RequestParam("idEvent") Long idEvent) {

		daoS.deleteEvent(daoS.displayEventById(idEvent));
	}
	
	
	@PutMapping(value = "/updateEvent")
	public void updateEvent(@RequestParam("idEvent") Long idEvent, @RequestBody Event dataEvent) {
		Event event = daoS.displayEventById(idEvent);
		event.setTitle(dataEvent.getTitle());
		event.setDescription(dataEvent.getDescription());
		event.setFinishDate(dataEvent.getFinishDate());
		daoS.updateEvent(event);
	}
	
}
