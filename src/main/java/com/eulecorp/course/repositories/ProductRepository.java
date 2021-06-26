package com.eulecorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eulecorp.course.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
