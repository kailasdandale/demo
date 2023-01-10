package com.jio.repository;

import java.util.Optional;

import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jio.entity.User;
@Repository
public interface userRepo extends JpaRepository<User, Integer>{

	Optional<User> findByEmail(@NotNull(message = "Please Enter Email") String email);

}
