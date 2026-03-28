package com.sb.main.global;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sb.main.exception.ErrorResponse;
import com.sb.main.exception.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	//Handle 404 - resource not found 
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleNotFound(ResourceNotFoundException ex,HttpServletRequest request)
	{
		ErrorResponse error = new ErrorResponse(
				HttpStatus.NOT_FOUND.value(),
				"Not Found",
				 ex.getMessage(),
				 request.getRequestURI() 
		);
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	
	// handle generic Exception(fallback -500)
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleGlobalException(Exception ex, HttpServletRequest request)
	{
		ErrorResponse error = new ErrorResponse(
				HttpStatus.INTERNAL_SERVER_ERROR.value(),
				"Internal Server Error",
				"An unexpected error occured:"+ex.getMessage(),
				request.getRequestURI()
		);
		return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	} 
}
