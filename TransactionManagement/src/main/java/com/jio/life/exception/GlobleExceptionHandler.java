package com.jio.life.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobleExceptionHandler {

	@ExceptionHandler(InsufficientAmountException.class)
	public String handlerException(InsufficientAmountException e) {
		return e.getMessage();
	}
}
