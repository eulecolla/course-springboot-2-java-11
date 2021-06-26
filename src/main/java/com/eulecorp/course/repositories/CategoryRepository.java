package com.eulecorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eulecorp.course.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
