package com.flightapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AirlineExceptions {
   @ExceptionHandler(value = AirlineNotFoundException.class)
   public ResponseEntity<Object> exception(AirlineNotFoundException exception) {
      return new ResponseEntity<>("Airline not found", HttpStatus.NOT_FOUND);
   }
   
}
