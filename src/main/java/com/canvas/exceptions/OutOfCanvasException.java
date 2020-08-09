package com.canvas.exceptions;

public class OutOfCanvasException extends Exception {

	private static final long serialVersionUID = 1782934L;

	public OutOfCanvasException(String message) {
		super(message);
	}

	public OutOfCanvasException(String message, Throwable th) {
		super(message, th);
	}
	
	
}
