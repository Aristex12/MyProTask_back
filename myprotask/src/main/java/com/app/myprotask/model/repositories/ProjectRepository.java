package com.app.myprotask.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.myprotask.model.Project;
import com.app.myprotask.model.Task;


@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

	/**
	 * @author Manuel
	 * @param idUser
	 * @return all projects of a user that are active
	 */
	@Query(value = "SELECT p.* FROM projects p, user_projects up WHERE p.id_project = up.project_id AND up.user_id = ?1 AND up.is_active = true", nativeQuery = true)
	List<Project> displayProjectsByUserId(Long idUser);
	
}
