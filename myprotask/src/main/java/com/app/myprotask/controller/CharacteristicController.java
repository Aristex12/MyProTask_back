package com.app.myprotask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.myprotask.model.Characteristic;
import com.app.myprotask.model.dao.DAOService;

@RestController
@RequestMapping(value = "api/characteristic")
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET,
		RequestMethod.DELETE })
public class CharacteristicController {

	@Autowired
	DAOService daoS;

	/**
	 * 
	 * @author Alejandro
	 * @return list of all characteristics
	 */
	@GetMapping(value = "/displayCharacteristics")
	public List<Characteristic> displayCharacteristics() {
		return daoS.displayCharacteristics();
	}

}