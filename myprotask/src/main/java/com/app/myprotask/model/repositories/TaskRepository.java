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
	@Query(value = "SELECT t.* FROM tasks t, user_tasks ut WHERE t.id_task = ut.task_id AND ut.user_id = ?1 AND ut.isActive = true ORDER BY CASE WHEN priority = 'HIGH' THEN 1 WHEN priority = 'MID' THEN 2 WHEN priority = 'LOW' THEN 3 END"
			+ "", nativeQuery = true)
	List<Task> displayTasksByUserId(Long idUser);

	/**
	 * @author Manuel
	 * @param idProject
	 * @return all tasks in which the specified project has participated
	 */
	@Query(value = "SELECT * FROM tasks where project_id = ?1 ORDER BY CASE WHEN priority = 'HIGH' THEN 1 WHEN priority = 'MID' THEN 2 WHEN priority = 'LOW' THEN 3 END", nativeQuery = true)
	List<Task> displayTasksByProjectId(Long idProject);
}
