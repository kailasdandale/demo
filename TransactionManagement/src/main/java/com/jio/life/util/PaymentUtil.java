package com.jio.life.util;

import java.util.HashMap;
import java.util.Map;

import com.jio.life.exception.InsufficientAmountException;

public class PaymentUtil {

	static Map<String, Double> payment = new HashMap<>();

	static {
		payment.put("ac1", 10000.00);
		payment.put("ac2", 12000.00);
		payment.put("ac3", 13000.00);
		payment.put("ac4", 14000.00);
		payment.put("ac5", 1000.00);
	}

	public static boolean validCredential(String accNo, double paidAmount) {
		if (paidAmount > payment.get(accNo)) {
			throw new InsufficientAmountException("Insufficient fund..!");
		} else {
			return true;
		}
	}

}
