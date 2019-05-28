package com.szkj.common.exception;

public class GoodsException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public GoodsException() {
		super();
	}
	
	public GoodsException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
	public GoodsException(String message, Throwable cause) {
		super(message, cause);
	}

	public GoodsException(String message) {
		super(message);
	}

	public GoodsException(Throwable cause) {
		super(cause);
	}
}
