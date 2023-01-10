package com.neo.soft.address.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neo.soft.address.model.Address;

@Repository
public interface AddressRepositoty extends JpaRepository<Address, Integer> {

	public List<Address> findByUserId(int userId);
	
}
