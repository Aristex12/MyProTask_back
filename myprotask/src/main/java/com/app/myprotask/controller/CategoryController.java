package com.app.myprotask.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.myprotask.model.Category;
import com.app.myprotask.model.dao.DAOService;

/**
 * @author Manuel
 */
@RestController
@RequestMapping(value = "api/category")
public class CategoryController {

	@Autowired
	DAOService daoS;

	/**
	 * @author Manuel
	 * @return all Categories
	 */
	@GetMapping(value = "/displayCategories")
	public ResponseEntity<?> displayCategories() {
		try {
			List<Category> categories = daoS.displayCategories();
			if (categories.isEmpty()) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No categories found");
			}				
			return ResponseEntity.status(HttpStatus.OK).body(categories);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while displaying categories: " + e.getMessage());
		}
	}

}
