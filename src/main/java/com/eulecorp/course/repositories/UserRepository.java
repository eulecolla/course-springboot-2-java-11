package com.eulecorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eulecorp.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
