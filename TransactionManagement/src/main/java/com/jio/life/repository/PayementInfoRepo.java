package com.jio.life.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jio.life.model.PaymentInfo;
@Repository
public interface PayementInfoRepo extends JpaRepository<PaymentInfo, String>{

}
