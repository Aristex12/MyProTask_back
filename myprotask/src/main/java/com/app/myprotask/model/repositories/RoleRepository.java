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

	@Query(value = "SELECT * FROM role where name = ?1", nativeQuery = true)
	Role getRoleByName(String name);
}
