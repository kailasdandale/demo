package com.jio.life.util;

import com.jio.life.model.PassengerInfo;
import com.jio.life.model.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketBookinRequest {

	private PassengerInfo passengerInfo;
	private PaymentInfo paymentInfo;
}
