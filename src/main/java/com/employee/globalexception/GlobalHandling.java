package com.employee.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.employee.customexception.IdNotFoundException;
import com.employee.customexception.SalaryNotFoundException;

@RestControllerAdvice
public class GlobalHandling {
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Object> idHandling()
	{
		return new ResponseEntity<>("Sorry this is not a valid id",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(SalaryNotFoundException.class)
	public ResponseEntity<Object> isHandling()
	{
		return new ResponseEntity<>("sorry this not allow",HttpStatus.BAD_REQUEST);
	}

}
