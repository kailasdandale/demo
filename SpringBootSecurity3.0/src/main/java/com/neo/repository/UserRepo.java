package com.neo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neo.model.UserInfo;
@Repository
public interface UserRepo extends JpaRepository<UserInfo, Integer>{

	Optional<UserInfo> findByName(String username);

}
