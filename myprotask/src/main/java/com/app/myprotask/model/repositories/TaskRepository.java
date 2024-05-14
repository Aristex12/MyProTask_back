package com.app.myprotask.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.myprotask.model.Task;

/**
 * 
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

	/**
	 * @author Manuel
	 * @param idUser
	 * @return all tasks in which the specified user has participated
	 */
	@Query(value = "SELECT t.* FROM tasks t, participants p WHERE t.id_task = p.task_id AND p.user_id = ?1 AND t.status = 'IN_PROGRESS' ORDER BY CASE WHEN status = 'HIGH' THEN 1 WHEN status = 'MID' THEN 2 WHEN status = 'LOW' THEN 3 END"
			+ "", nativeQuery = true)
	List<Task> displayTasksByUserId(Long idUser);

	/**
	 * @author Manuel
	 * @param idProject
	 * @return all tasks in which the specified project has participated
	 */
	@Query(value = "SELECT t.* FROM tasks t, participants p WHERE t.id_task = p.task_id AND p.user_id = ?1 AND t.status = 'IN_PROGRESS' ORDER BY CASE WHEN status = 'HIGH' THEN 1 WHEN status = 'MID' THEN 2 WHEN status = 'LOW' THEN 3 END", nativeQuery = true)
	List<Task> displayTasksByProjectId(Long idProject);
}
