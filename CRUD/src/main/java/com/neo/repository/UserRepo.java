package com.neo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neo.model.User1;
@Repository
public interface UserRepo extends JpaRepository<User1, Integer> {

	Optional<User1> findByEmail(String email);
}
