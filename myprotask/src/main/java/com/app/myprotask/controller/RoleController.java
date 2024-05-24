package com.app.myprotask.controller;
 
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
import com.app.myprotask.model.Role;
import com.app.myprotask.model.User;
import com.app.myprotask.model.dao.DAOService;
 
/**
* @author Alejandro
*/
@RestController
@RequestMapping(value = "api/role")
public class RoleController {
 
	@Autowired
	DAOService daoS;
 
	/**
	 * Used in Users [ User ]
	 *
	 * @author Alejandro
	 * @param idUser
	 * @return objet manager or member of a user
	 */
	@GetMapping(value = "/displayRoleUserProjectByIdUser")
	Role displayRoleUserProjectByIdUser(@RequestParam("idUser") Long idUser) {
 
		User user = daoS.displayUserById(idUser);
		Role role;
 
		if (user.getRole().getName().equals("admin")) {
			role = daoS.getRoleByName("admin");
		} else {
			if (daoS.displayRoleUserProjectByIdUser(idUser) >= 1) {
				role = daoS.getRoleByName("manager");
			} else {
				role = daoS.getRoleByName("member");
			}
		}
		return role;
	}
 
}