package com.neo.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobleExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(UserNotFound.class)
	public ResponseEntity<?> handleException(UserNotFound ex) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {

		Map<String, Object> map = new HashMap<>();
		List<String> error = ex.getBindingResult()
				.getFieldErrors()
				.stream()
				.map(e -> e.getDefaultMessage())
				.collect(Collectors.toList());
		map.put("Errors", error);

		return new ResponseEntity<Object>(map, headers, status);

	}
}
