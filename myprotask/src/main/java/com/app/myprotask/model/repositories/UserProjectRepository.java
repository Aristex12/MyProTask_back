package com.app.myprotask.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.myprotask.model.UserProject;

/**
 * Repository where we will have all the necessary queries about the UserProject
 * table.
 * 
 * @author Manuel
 */
@Repository
public interface UserProjectRepository extends JpaRepository<UserProject, Long> {

	/**
	 * 
	 * @param idProject
	 * @return all projects from one specific project
	 */
	@Query(value = "SELECT * FROM user_projects WHERE project_id = ?1 ORDER BY role_id = 3 DESC", nativeQuery = true)
	List<UserProject> displayUserProjectByProjectId(Long idProject);
	
	
	/**
	 * 
	 * @author Manuel
	 * @param idUser
	 * @return all projects from one specific user
	 */
	@Query(value = "SELECT * FROM user_projects WHERE user_id = ?1", nativeQuery = true)
	List<UserProject> displayUserProjectByUserId(Long idUser);

	
	
	/**
	 * View ADMIN
	 * 
	 * @author Manuel
	 * @return all the information of users and projects they have participated in, sorted by their active status
	 */
	@Query(value = "SELECT up.* FROM user_projects up, projects p "
			+ "WHERE up.project_id = p.id_project "
			+ "AND p.is_active = true "
			+ "ORDER BY up.is_active", nativeQuery = true)
	List<UserProject> displayActiveUserProject();

	
	/**
	 * View USER
	 * 
	 * @author Manuel
	 * @return all users and projects they have participated in, as long as the introduced user participates in the project, sorted by their active status
	 */
	@Query(value = "SELECT up.* FROM user_projects up, projects p "
			+ "WHERE p.id_project = up.project_id "
			+ "AND p.is_active = true "
			+ "AND up.user_id = ?1 "
			+ "ORDER BY up.is_active", nativeQuery = true)
	List<UserProject> displayActiveUserProjectByUserId(Long idUser);

}
