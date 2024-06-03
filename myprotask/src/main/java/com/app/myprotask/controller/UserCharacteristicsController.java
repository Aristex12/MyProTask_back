package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.UserCharacteristic;
import com.app.myprotask.model.dao.DAOService;

/**
 * @author Alejandro
 */
@RestController
@RequestMapping(value = "api/userCharacteristic")
public class UserCharacteristicsController {

	@Autowired
	DAOService daoS;

	/**
	 * @author Manuel
	 * @param idUser
	 * @return all User characteristics from user 
	 */
	@GetMapping(value = "/displayUserCharacteristicsByIdUser")
	public ResponseEntity<?> displayUserCharacteristicsByIdUser(@RequestParam("idUser") Long idUser) {

		try {
			List<UserCharacteristic> userCharacteristics = daoS.displayUserCharacteristicsByIdUser(idUser);
			if (!userCharacteristics.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(userCharacteristics);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("Characteristics not found for user with ID: " + idUser);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while retrieving user characteristics: " + e.getMessage());
		}
	}

	/**
	 * Used in EditProfile view [User]
	 * 
	 * Add UserCharacteristics with the specific characteristic
	 * 
	 * @author Alejandro
	 * @param userCharacteristics
	 */
	@PostMapping(value = "/addUserCharacteristicByIdUser")
	public ResponseEntity<String> addUserCharacteristicByIdUser(@RequestParam("idUser") Long idUser,
			@RequestParam("idCharacteristic") Long idCharacteristic, @RequestParam("experience") Integer experience) {
		try {
			daoS.addUserCharacteristicByIdUser(idUser, idCharacteristic, experience);
			return ResponseEntity.status(HttpStatus.OK).body("User characteristic added successfully");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while adding user characteristic: " + e.getMessage());
		}
	}

	/**
	 * Used in EditProfile view [User]
	 * 
	 * Delete UserCharacteristics with the specific characteristic
	 * 
	 * @author Alejandro
	 * @param userCharacteristics
	 */
	@DeleteMapping(value = "/deleteUserCharacteristicByIdUser")
	public ResponseEntity<String> deleteUserCharacteristicByIdUser(@RequestParam("idUser") Long idUser,
			@RequestParam("idCharacteristic") Long idCharacteristic) {
		try {
			daoS.deleteUserCharacteristicByIdUser(idUser, idCharacteristic);
			return ResponseEntity.status(HttpStatus.OK).body("User characteristic deleted successfully");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while deleting user characteristic: " + e.getMessage());
		}
	}

}
