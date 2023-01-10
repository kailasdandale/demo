package com.jio.exception;

public class UserNotFound extends RuntimeException {
	public UserNotFound(String msg) {
		super(msg);
	}
}
