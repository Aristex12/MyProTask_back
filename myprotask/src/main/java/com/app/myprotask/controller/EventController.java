package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Object> displayEventsByIdUser(@RequestParam("idUser") Long idUser) {
		try {
			List<Event> events = daoS.displayEventsByIdUser(idUser);
			if (!events.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(events);
			} else {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No events found for the user.");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while fetching events: " + e.getMessage());
		}
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
	public ResponseEntity<String> addEvent(@RequestBody Event event) {
		try {
			daoS.addEvent(event);
			return ResponseEntity.status(HttpStatus.CREATED).body("Event added successfully");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Failed to add event: " + e.getMessage());
		}
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
	public ResponseEntity<String> deleteEvent(@RequestParam("idEvent") Long idEvent) {
		try {
			Event event = daoS.displayEventById(idEvent);
			if (event != null) {
				daoS.deleteEvent(event);
				return ResponseEntity.status(HttpStatus.OK).body("Event deleted successfully");
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Event not found");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Failed to delete event: " + e.getMessage());
		}
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
	public ResponseEntity<String> updateEvent(@RequestParam("idEvent") Long idEvent, @RequestBody Event dataEvent) {
		try {
			Event event = daoS.displayEventById(idEvent);
			if (event != null) {
				event.setTitle(dataEvent.getTitle());
				event.setDescription(dataEvent.getDescription());
				event.setFinishDate(dataEvent.getFinishDate());
				daoS.updateEvent(event);
				return ResponseEntity.status(HttpStatus.OK).body("Event updated successfully");
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Event not found");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Failed to update event: " + e.getMessage());
		}
	}

}
