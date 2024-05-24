package com.app.myprotask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	 * Add UserCharacteristics with the specific characteristic
	 * 
	 * @author Alejandro
	 * @param userCharacteristics
	 */
	@PostMapping(value = "/addUserCharacteristicByIdUser")
	public void addUserCharacteristicByIdUser(@RequestParam("idUser") Long idUser,
			@RequestParam("idCharacteristic") Long idCharacteristic, @RequestParam("experience") Integer experience) {

		daoS.addUserCharacteristicByIdUser(idUser, idCharacteristic, experience);
	}

	/**
	 * Delete UserCharacteristics with the specific characteristic
	 * 
	 * @author Alejandro
	 * @param userCharacteristics
	 */
	@DeleteMapping(value = "/deleteUserCharacteristicByIdUser")
	public void deleteUserCharacteristicByIdUser(@RequestParam("idUser") Long idUser,
			@RequestParam("idCharacteristic") Long idCharacteristic) {

		daoS.deleteUserCharacteristicByIdUser(idUser, idCharacteristic);
	}
}
