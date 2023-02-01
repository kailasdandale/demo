package com.jio.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobleExceptionHandler extends ResponseEntityExceptionHandler {

@Override
protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
		HttpHeaders headers, HttpStatus status, WebRequest request) {


	Map<String, Object>body=new HashMap<>();
	
	List<String> errors = ex.getBindingResult()
	.getFieldErrors()
	.stream()
	.map(e->e.getDefaultMessage())
	.collect(Collectors.toList());
	
	body.put("Ooops Error!!!", errors);
	
	return new ResponseEntity<Object>(body,headers, status);
	
}

	@ExceptionHandler(UserNotFound.class)
	public ResponseEntity<?>handleException(UserNotFound e){
		
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
}
