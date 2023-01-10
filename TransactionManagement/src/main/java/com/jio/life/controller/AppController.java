package com.jio.life.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jio.life.model.PassengerInfo;
import com.jio.life.service.TicketBookingService;
import com.jio.life.util.Responce;
import com.jio.life.util.TicketBookinRequest;

@RestController
public class AppController {

	Logger loger = LoggerFactory.getLogger(AppController.class);

	@Autowired
	private TicketBookingService bookingService;

	@PostMapping(value = "/book-ticket")
	public Responce bookTicket(@RequestBody TicketBookinRequest request) {
		loger.info("In bookTicket function");
		return bookingService.bookTicket(request);
	}
	@GetMapping("/{name}")
	public List<PassengerInfo> getPassangerInfo(@PathVariable ("name")String name) {
		
		return bookingService.getPassangerInfo(name);
	}

}
