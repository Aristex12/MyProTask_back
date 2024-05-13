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
	@Query(value = "select t.* from tasks t, participants p where t.id_task = p.task_id and p.user_id = ?1", nativeQuery = true)
	List<Task> displayTasksByUserId(Long idUser);
}
