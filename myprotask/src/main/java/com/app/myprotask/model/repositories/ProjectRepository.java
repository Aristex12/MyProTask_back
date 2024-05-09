package com.app.myprotask.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.myprotask.model.Project;

/**
 * 
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{

}
