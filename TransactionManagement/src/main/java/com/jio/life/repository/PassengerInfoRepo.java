package com.jio.life.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jio.life.model.PassengerInfo;

@Repository
public interface PassengerInfoRepo extends JpaRepository<PassengerInfo, Long>{

	List<PassengerInfo> findByName(String name);

}
