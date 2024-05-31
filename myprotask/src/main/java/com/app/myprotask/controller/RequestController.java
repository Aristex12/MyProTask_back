package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.Project;
import com.app.myprotask.model.Request;
import com.app.myprotask.model.User;
import com.app.myprotask.model.dao.DAOService;

/**
 * @author Manuel
 */
@RestController
@RequestMapping(value = "api/request")
public class RequestController {

	@Autowired
	DAOService daoS;

	/**
	 * @author Manuel
	 * @param idUser
	 * @return all requests from all projects of a user
	 */
	@GetMapping(value = "/displayRequestsByProjectsIdUser")
	public ResponseEntity<?> displayRequestsByProjectsIdUser(@RequestParam("idUser") Long idUser) {
		try {
			List<Request> requests = daoS.displayRequestsByProjectsIdUser(idUser);
			if (requests != null && !requests.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(requests);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No requests found for the specified user");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while retrieving the requests: " + e.getMessage());
		}
	}

	/**
	 * @author Manuel
	 * @param idRequest
	 * @return the request with the specified id
	 */
	@GetMapping(value = "/displayRequestById")
	public ResponseEntity<?> displayRequestById(@RequestParam("idRequest") Long idRequest) {
		try {
			Request request = daoS.displayRequestById(idRequest);
			if (request != null) {
				return ResponseEntity.status(HttpStatus.OK).body(request);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Request not found");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while retrieving the request: " + e.getMessage());
		}
	}

	/**
	 * @author Manuel
	 * @return a list of all requests
	 */
	@GetMapping(value = "/displayRequests")
	public ResponseEntity<?> displayRequests() {
		try {
			List<Request> requests = daoS.displayRequests();
			return ResponseEntity.status(HttpStatus.OK).body(requests);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while retrieving the requests: " + e.getMessage());
		}
	}

	/**
	 * @author Manuel
	 * @param message
	 * @param idUser
	 * @param idProject
	 * @return a response indicating the result of the add request operation
	 */
	@PostMapping(value = "/addRequest")
	public ResponseEntity<String> addRequest(@RequestParam("message") String message,
			@RequestParam("idUser") Long idUser, @RequestParam("idProject") Long idProject) {
		try {
			User user = daoS.displayUserById(idUser);
			Project project = daoS.displayProjectById(idProject);
			if (user != null && project != null) {
				Request request = new Request(message, user, project);
				daoS.addRequest(request);
				return ResponseEntity.status(HttpStatus.CREATED).body("Request added successfully");
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User or project not found");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while adding the request: " + e.getMessage());
		}
	}

	/**
	 * @author Manuel
	 * @param idRequest
	 * @return a response indicating the result of the remove request operation
	 */
	@DeleteMapping(value = "/deleteRequestById")
	public ResponseEntity<String> deleteRequestById(@RequestParam("idRequest") Long idRequest) {
	    try {
	        Request request = daoS.displayRequestById(idRequest);
	        if (request != null) {
	            daoS.deleteRequest(request);
	            return ResponseEntity.status(HttpStatus.OK).body("Request removed successfully");
	        } else {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Request not found");
	        }
	    } catch (DataIntegrityViolationException e) {
	        return ResponseEntity.status(HttpStatus.CONFLICT)
	                             .body("Cannot delete the request due to a foreign key constraint: " + e.getMessage());
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                             .body("An error occurred while removing the request: " + e.getMessage());
	    }
	}

}
