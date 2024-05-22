package com.app.myprotask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.dao.DAOService;

/**
 * @author Alejandro
 */
@RestController
@RequestMapping(value = "api/userCharacteristic")
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET,
		RequestMethod.DELETE })
public class UserCharacteristicsController {
	
	@Autowired
	DAOService daoS;
	
	/**
	 * Add UserCharacteristics with the specific characteristic
	 * 
	 * @author Alejandro
	 * @param userCharacteristics
	 */
	@PutMapping(value = "/addUserCharacteristicByIdUser")
	public void addUserCharacteristicByIdUser(@RequestParam("idUser") Long idUser, @RequestParam("idCharacteristic") Long idCharacteristic) {
		
		daoS.addUserCharacteristicByIdUser(idUser, idCharacteristic);
	}
	
	/**
	 * Delete UserCharacteristics with the specific characteristic
	 * 
	 * @author Alejandro
	 * @param userCharacteristics
	 */
	@PutMapping(value = "/addUserCharacteristicByIdUser")
	public void deleteUserCharacteristicByIdUser(@RequestParam("idUser") Long idUser, @RequestParam("idCharacteristic") Long idCharacteristic) {
		
		daoS.deleteUserCharacteristicByIdUser(idUser, idCharacteristic);
	}
}
