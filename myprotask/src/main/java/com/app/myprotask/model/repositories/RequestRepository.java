package com.app.myprotask.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.myprotask.model.Request;

/**
 * 
 */
@Repository
public interface RequestRepository extends JpaRepository<Request, Long>{

	/**
	 * @author Manuel
	 * @param idProject
	 * @return all requests from one project
	 */
	@Query(value = "SELECT * FROM requests WHERE project_id = ?1",nativeQuery = true)
	List<Request> displayRequestsByIdProject(Long idProject);
}
