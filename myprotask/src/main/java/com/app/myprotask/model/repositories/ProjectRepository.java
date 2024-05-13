package com.app.myprotask.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.myprotask.model.Project;


@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

	/**
	 * @author Manuel
	 * @param idUser
	 * @return all projects in which the specified user has participated
	 */
	@Query(value = "select p.* from projects p, members m where p.id_project = m.project_id and m.user_id = ?1", nativeQuery = true)
	List<Project> displayProjectsByUserId(Long idUser);
}
