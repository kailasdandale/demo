package com.neo.soft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neo.soft.model.User;

@Repository
public interface UserRepostory extends JpaRepository<User, Integer> {

}
