package com.app.myprotask.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.myprotask.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
