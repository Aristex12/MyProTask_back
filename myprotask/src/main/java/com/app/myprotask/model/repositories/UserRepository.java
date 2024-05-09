package com.app.myprotask.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.myprotask.model.User;

/**
 * 
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
