package com.app.myprotask.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.myprotask.model.UserTask;

/**
 * Repository where we will have all the necessary queries about the UserTask table.
 * 
 * @author Manuel
 */
@Repository
public interface UserTaskRepository extends JpaRepository<UserTask, Long>{

}
