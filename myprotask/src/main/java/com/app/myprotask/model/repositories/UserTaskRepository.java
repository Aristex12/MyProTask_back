package com.app.myprotask.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.myprotask.model.UserTask;

/**
 * Repository where we will have all the necessary queries about the UserTask
 * table.
 * 
 * @author Manuel
 */
@Repository
public interface UserTaskRepository extends JpaRepository<UserTask, Long> {

	
	/**
	 * @author Manuel
	 * @param idTask
	 * @return all user tasks of a user
	 */
	@Query(value = "SELECT * FROM user_tasks WHERE user_id = ?1", nativeQuery = true)
	List<UserTask> displayUserTasksByUserId(Long idUser);
	
	/**
	 * @author Manuel
	 * @param idTask
	 * @return all user tasks of a task
	 */
	@Query(value = "SELECT * FROM user_tasks WHERE task_id = ?1", nativeQuery = true)
	List<UserTask> displayUserTasksByTaskId(Long idTask);

	/**
	 * @author Manuel
	 * @return all tasks and users where both are active, order
	 */
	@Query(value = "SELECT ut.* FROM user_tasks ut, tasks t " + "WHERE ut.task_id = t.id_task "
			+ "AND ut.is_active = true " + "AND ut.user_id = ?1 "
			+ "ORDER BY CASE WHEN priority = 'HIGH' THEN 1 WHEN priority = 'MID' THEN 2 WHEN priority = 'LOW' THEN 3 END, t.name", nativeQuery = true)
	List<UserTask> displayActiveUserTasksByUserId(Long idUser);
}
