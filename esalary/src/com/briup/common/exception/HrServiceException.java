package com.briup.common.exception;

public class HrServiceException extends Exception {

	public HrServiceException() {
		super();
		
	}

	public HrServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public HrServiceException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public HrServiceException(String message) {
		super(message);
		
	}

	public HrServiceException(Throwable cause) {
		super(cause);
		
	}

}
