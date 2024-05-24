package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.Event;
import com.app.myprotask.model.dao.DAOService;

/**
 * @author Alejandro
 */
@RestController
@RequestMapping(value = "api/event")
public class EventController {
	
	@Autowired
	DAOService daoS;
	
	/**
	 * Used in Calendar view [User]
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
	 * Used in Calendar view [User]
	 * 
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
	
	/**
	 * Used in Calendar view [User]
	 * 
	 * Delete one event
	 * 
	 * @author Alejandro
	 * @param idEvent
	 */
	@DeleteMapping(value = "/deleteEvent")
	public void deleteEvent(@RequestParam("idEvent") Long idEvent) {

		daoS.deleteEvent(daoS.displayEventById(idEvent));
	}
	
	/**
	 * Used in Calendar view [User]
	 * 
	 * Update the title, description and finish date of a specific Event
	 * 
	 * @author Alejandro
	 * @param idEvent
	 * @param dataEvent
	 */
	@PutMapping(value = "/updateEvent")
	public void updateEvent(@RequestParam("idEvent") Long idEvent, @RequestBody Event dataEvent) {
		Event event = daoS.displayEventById(idEvent);
		event.setTitle(dataEvent.getTitle());
		event.setDescription(dataEvent.getDescription());
		event.setFinishDate(dataEvent.getFinishDate());
		daoS.updateEvent(event);
	}
	
}
