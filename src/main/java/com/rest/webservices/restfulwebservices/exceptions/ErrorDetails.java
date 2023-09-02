package com.rest.webservices.restfulwebservices.exceptions;

import java.time.LocalDateTime;

public class ErrorDetails {
	private LocalDateTime timeStamp;
	private String message;
	private String details;

	public ErrorDetails(LocalDateTime timestamp, String message, String details) {
		super();
		this.timeStamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public LocalDateTime getTimestamp() {
		return timeStamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timeStamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
