package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.Characteristic;
import com.app.myprotask.model.dao.DAOService;

/**
 * @author Alejandro
 */
@RestController
@RequestMapping(value = "api/characteristic")
public class CharacteristicController {

	@Autowired
	DAOService daoS;

	/**
	 * @author Manuel
	 * @param idCharacteristic
	 * @return a Characteristic by ID
	 */
	@GetMapping(value = "/displayCharacteristicById")
	public ResponseEntity<?> displayCharacteristicById(@RequestParam("idCharacteristic") Long idCharacteristic) {

		try {
			Characteristic characteristic = daoS.displayCharacteristicById(idCharacteristic);
			if (characteristic != null) {
				return ResponseEntity.status(HttpStatus.OK).body(characteristic);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("Characteristic not found for ID: " + idCharacteristic);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while retrieving the characteristic: " + e.getMessage());
		}
	}

	/**
	 * Used in newProject [ Admin ]
	 * 
	 * @author Alejandro
	 * @return list of all characteristics
	 */
	@GetMapping(value = "/displayCharacteristics")
	public ResponseEntity<?> displayCharacteristics() {
		try {
			List<Characteristic> characteristics = daoS.displayCharacteristics();
			if (!characteristics.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(characteristics);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Characteristics not found");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while displaying characteristics: " + e.getMessage());
		}
	}

	/**
	 * Used in profile [ User ]
	 * 
	 * @author Alejandro
	 * @return A list of all characteristics that a specific user has
	 */
	@GetMapping(value = "/displayCharacteristicsByIdUser")
	public ResponseEntity<?> displayCharacteristicsByIdUser(@RequestParam("idUser") Long idUser) {
		try {
			List<Characteristic> characteristics = daoS.displayCharacteristicsByIdUser(idUser);
			if (!characteristics.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(characteristics);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("Characteristics not found for user with ID: " + idUser);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while displaying characteristics for user with ID " + idUser + ": "
							+ e.getMessage());
		}
	}

	/**
	 * Used in profile [ User ]
	 * 
	 * @author Alejandro
	 * @return A list of all characteristics that the user doesn't have
	 */
	@GetMapping(value = "/displayMissingCharacteristicsByIdUser")
	public ResponseEntity<?> displayMissingCharacteristicsByIdUser(@RequestParam("idUser") Long idUser) {
		try {
			List<Characteristic> missingCharacteristics = daoS.displayMissingCharacteristicsByIdUser(idUser);
			if (!missingCharacteristics.isEmpty()) {
				return ResponseEntity.status(HttpStatus.OK).body(missingCharacteristics);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("No missing characteristics found for user with ID: " + idUser);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while displaying missing characteristics for user with ID " + idUser + ": "
							+ e.getMessage());
		}
	}

}