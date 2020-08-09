package com.canvas.exceptions;

public class NoCanvasFoundException extends Exception {

	private static final long serialVersionUID = -7449469204428409196L;
	
	public NoCanvasFoundException(String message) {
		super(message);
	}

	public NoCanvasFoundException(String message, Throwable th) {
		super(message, th);
	}

}