package com.app.myprotask.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.myprotask.model.Role;

/**
 * Repository where we will have all the necessary queries about the Role table.
 * 
 * @author Manuel
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	/**
	 * @author Manuel
	 * @param idUser
	 * @return the number of projects where the given user is a manager
	 */
	@Query(value = "SELECT COUNT(*) FROM roles r, user_projects up WHERE r.id_role = up.role_id AND up.user_id = ?1 AND r.name = 'manager'", nativeQuery = true)
	Integer displayRoleUserProjectByIdUser(Long idUser);

	/**
	 * @author Manuel
	 * @param name
	 * @return a role by its name
	 */
	@Query(value = "SELECT * FROM roles where name = ?1", nativeQuery = true)
	Role getRoleByName(String name);
}
