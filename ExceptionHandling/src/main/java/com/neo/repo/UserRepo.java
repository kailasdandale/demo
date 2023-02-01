package com.neo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neo.model.User2;
@Repository
public interface UserRepo extends JpaRepository<User2, Integer>{

	Optional<User2>findByEmail(String email); 

}
