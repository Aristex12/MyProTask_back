package com.app.myprotask.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.myprotask.model.UserProject;


/**
 * Repository where we will have all the necessary queries about the UserProject table.
 * 
 * @author Manuel
 */
@Repository
public interface UserProjectRepository extends JpaRepository<UserProject, Long>{

}
