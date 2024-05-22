package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.UserCharacteristic;
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
	 * 
	 * @author Alejandro
	 * @param idUser
	 * @return list of UserCharacteristics of a specific user
	 */
	@GetMapping(value = "/displayUserCharacteristicsByIdUser")
	public List<UserCharacteristic> displayUserCharacteristicsByIdUser(@RequestParam("idUser") Long idUser) {
		return daoS.displayUserCharacteristicsByIdUser(idUser);
	}

	/**
	 * Update UserCharacteristics with the new list of characteristics
	 * 
	 * @author Alejandro
	 * @param userCharacteristics
	 */
	@PutMapping(value = "/updateUserCharacteristicByIdUser")
	public void updateUserCharacteristicByIdUser(@RequestBody List<UserCharacteristic> userCharacteristics) {
		
		daoS.updateUserCharacteristicByIdUser(userCharacteristics);
	}
}
