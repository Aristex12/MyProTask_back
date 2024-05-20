package com.app.myprotask.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.myprotask.model.Project;


@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
	
	/**
	 * @author Manuel
	 * @param characteristicIds
	 * @param size
	 * @return List of all projects with the specific characteristics
	 */
	@Query(
		    value = "SELECT p.* FROM projects p, project_characteristics pc, characteristics c " +
		            "WHERE p.id_project = pc.project_id " +
		            "AND pc.characteristic_id = c.id_characteristic " +
		            "AND c.id_characteristic IN :characteristicIds " + 
		            "GROUP BY p.id_project " +
		            "HAVING COUNT(DISTINCT c.id_characteristic) >= :size",
		    nativeQuery = true)
		List<Project> searchProjectsByCharacteristics(@Param("characteristicIds") List<Long> characteristicIds, @Param("size") int size);

	
	/**
	 * @author Manuel
	 * @param idUser
	 * @return all projects of a user that are inactive
	 */
	@Query(value = "SELECT p.* FROM projects p, user_projects up WHERE p.id_project = up.project_id AND up.user_id = ?1 AND up.is_active = false", nativeQuery = true)
	List<Project> displayInactiveProjectsByUserId(Long idUser);
	
	/**
	 * @author Manuel
	 * @param idUser
	 * @return all projects of a user that are active
	 */
	@Query(value = "SELECT p.* FROM projects p, user_projects up WHERE p.id_project = up.project_id AND up.user_id = ?1 AND up.is_active = true", nativeQuery = true)
	List<Project> displayActiveProjectsByUserId(Long idUser);
	
	
	
	
}
