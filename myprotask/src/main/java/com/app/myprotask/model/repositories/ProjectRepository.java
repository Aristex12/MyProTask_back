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
	@Query(value = "select p.* from projects p, members m where p.id_project = m.project_id and m.user_id = ?1 and p.status = 'IN_PROGRESS'", nativeQuery = true)
	List<Project> displayProjectsByUserId(Long idUser);
	
}
