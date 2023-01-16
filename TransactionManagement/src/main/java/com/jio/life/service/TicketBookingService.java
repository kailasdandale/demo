package com.jio.life.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.jio.life.exception.InsufficientAmountException;
import com.jio.life.model.PassengerInfo;
import com.jio.life.model.PaymentInfo;
import com.jio.life.repository.PassengerInfoRepo;
import com.jio.life.repository.PayementInfoRepo;
import com.jio.life.util.PaymentUtil;
import com.jio.life.util.Responce;
import com.jio.life.util.TicketBookinRequest;

@Service
public class TicketBookingService {

	@Autowired
	private PassengerInfoRepo passengerInfoRepo;
	@Autowired
	private PayementInfoRepo payementInfoRepo;

	@Transactional
	public Responce bookTicket(@RequestBody TicketBookinRequest request) {

		PassengerInfo passengerInfo = request.getPassengerInfo();
		//save passenger data//
		passengerInfo = passengerInfoRepo.save(passengerInfo);

		PaymentInfo paymentInfo = request.getPaymentInfo();
		// check acc bal is grater than paid amount //          //paid Amount
		PaymentUtil.validCredential(paymentInfo.getAccountNo(), passengerInfo.getFare());

		paymentInfo.setPassengerId(passengerInfo.getPId());
		paymentInfo.setAmount(passengerInfo.getFare());

		payementInfoRepo.save(paymentInfo);

		return new Responce("SUCCESS", passengerInfo.getFare(), passengerInfo);
	}

	public List<PassengerInfo> getPassangerInfo(String name) {

		if (passengerInfoRepo.findByName(name).isEmpty()) {

			throw new InsufficientAmountException("Please enter valid Name");
		
		}
		return passengerInfoRepo.findByName(name);
		
	}

}
