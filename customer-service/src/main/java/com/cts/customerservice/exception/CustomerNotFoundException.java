package com.cts.customerservice.exception;

public class CustomerNotFoundException extends RuntimeException {
	 public CustomerNotFoundException(String message) {
	        super(message);
	    }
}
