package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.app.myprotask.model.User;
import com.app.myprotask.model.dao.DAOService;

/**
 * @author Alejandro
 */
@RestController
@RequestMapping(value = "api/user")
public class UserController {

	@Autowired
	BCryptPasswordEncoder passwordEncoder; // Inyectar BCryptPasswordEncoder

	@Autowired
	DAOService daoS;
	
	/**
	 * @author Manuel
	 * @param characteristicsIds
	 * @return all users who match at least 1 characteristic from the provided ones, sorted by matches.
	 */
	@PostMapping(value = "/displayUsersByCharacteristics")
	public ResponseEntity<?> displayUsersByCharacteristics(@RequestBody List<Long> characteristicsIds) {
		try {
			List<User> users = daoS.displayUsersByCharacteristics(characteristicsIds);
			if (!users.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(users);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("No users found with the specified characteristics");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while searching users by characteristics: " + e.getMessage());
		}
	}

	/**
	 * @author Manuel
	 * @param idProject
	 * @return List of all users with the specific project
	 */
	@GetMapping(value = "/displayUsersByIdProject")
	public ResponseEntity<?> displayUsersByIdProject(@RequestParam("idProject") Long idProject) {
	    try {
	        List<User> users = daoS.displayUsersByIdProject(idProject);
	        if (!users.isEmpty()) {
	            return ResponseEntity.status(HttpStatus.OK).body(users);
	        } else {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No users found for project with ID: " + idProject);
	        }
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                             .body("An error occurred while displaying users by project ID: " + e.getMessage());
	    }
	}


	/**
	 * Used in Search User [ Manager ]
	 * 
	 * @author Alejandro
	 * @param characteristics
	 * @return List of users with the specific characteristics
	 */
	@PostMapping(value = "/searchUsersByCharacteristics")
	public ResponseEntity<?> searchUsersByCharacteristics(@RequestBody List<Long> characteristicsIds) {
		try {
			List<User> users = daoS.searchUsersByCharacteristics(characteristicsIds, characteristicsIds.size());
			if (!users.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(users);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("No users found with the specified characteristics");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while searching users by characteristics: " + e.getMessage());
		}
	}

	/**
	 * Used in ? [ Admin ]
	 *
	 * Update the user's status to active or inactive and their participation in the
	 * project accordingly
	 * 
	 * @author Manuel
	 */
	@PutMapping(value = "/updateActiveUser")
	public ResponseEntity<String> updateActiveUser(@RequestParam("idUser") Long idUser) {
		try {
			User user = daoS.displayUserById(idUser);
			if (user != null) {
				daoS.updateActiveUser(user);
				return ResponseEntity.status(HttpStatus.OK).body("User status updated successfully");
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while updating the user's status: " + e.getMessage());
		}
	}

	/**
	 * Used in Profile view [User]
	 * 
	 * @author Alejandro
	 * @param idUser
	 * @return All the objct of an specific user
	 */
	@GetMapping(value = "/displayUserById")
	public ResponseEntity<?> displayUserById(@RequestParam("idUser") Long idUser) {
		try {
			User user = daoS.displayUserById(idUser);
			if (user != null) {
				return ResponseEntity.status(HttpStatus.OK).body(user);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while displaying the user by ID: " + e.getMessage());
		}
	}

	/**
	 * @author Manuel
	 * @param email
	 * @param password
	 * @return id user when email and password are matches
	 */
	@GetMapping(value = "/searchUserByEmailPassword")
	public ResponseEntity<?> searchUserByEmailPassword(@RequestParam("email") String email,
			@RequestParam("password") String password) {
		try {
			Long userId = daoS.searchUserByEmailPassword(email, password);
			if (userId != null) {
				return ResponseEntity.status(HttpStatus.OK).body(userId);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while searching for the user by email and password: " + e.getMessage());
		}
	}

	/**
	 * Used in register view [ Admin ]
	 * 
	 * Inserts a new user with data received from the form, here we will
	 * automatically generate the DAS and email
	 *
	 * @author Manuel
	 * @param user
	 */
	@PostMapping(value = "/addUser")
	public ResponseEntity<String> addUser(@RequestParam("name") String name,
			@RequestParam("lastName") String lastName) {
		try {
			daoS.addUser(new User(name, lastName, passwordEncoder.encode("Abcdefg1!"), daoS.getRoleByName("employee")));
			return ResponseEntity.status(HttpStatus.OK).body("User added successfully");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while adding the user: " + e.getMessage());
		}
	}

	/**
	 * Used in EditUser [ User ]
	 * 
	 * Updates the introduced user with the new data
	 * 
	 * @author Manuel
	 * @param idUser
	 * @param userCharacteristics
	 */
	@PutMapping(value = "/updateCvProfilePicDescriptionUserById")
	public ResponseEntity<String> updateCvProfilePicDescriptionUserById(
	        @RequestParam("idUser") Long idUser,
	        @RequestParam(value = "cv", required = false) String cv,
	        @RequestParam(value = "profilePic", required = false) String profilePic,
	        @RequestParam(value = "description", required = false) String description) {
	    try {
	        User user = daoS.displayUserById(idUser);
	        if (user != null) {
	            if (cv != null) {
	                user.setCv(cv);
	            }
	            if (profilePic != null) {
	                user.setProfilePic(profilePic);
	            }
	            if (description != null) {
	                user.setDescription(description);
	            }
	            daoS.updateUser(user);
	            return ResponseEntity.status(HttpStatus.OK).body("CV and profile picture updated successfully");
	        } else {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
	        }
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                .body("An error occurred while updating the user's CV and profile picture: " + e.getMessage());
	    }
	}

	/**
	 * Used in EditUser [ User ]
	 * 
	 * Updates the introduced user with the new password
	 * 
	 * @author Alejandro
	 * @param idUser
	 * @param password
	 */
	@PutMapping(value = "/updatePasswordUserById")
	public ResponseEntity<String> updatePasswordUserById(@RequestParam("idUser") Long idUser,
			@RequestParam("password") String password) {
		User user = daoS.displayUserById(idUser);
		if (user != null) {
			if (User.verifyPassword(password)) {
				try {
					user.setPassword(passwordEncoder.encode(password));
					daoS.updateUser(user);
					return ResponseEntity.status(HttpStatus.OK).body("Password updated successfully");
				} catch (Exception e) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
							.body("An error occurred while updating the user's password: " + e.getMessage());
				}
			} else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST)
						.body("The password does not meet the requirements");
			}
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
		}
	}

}
