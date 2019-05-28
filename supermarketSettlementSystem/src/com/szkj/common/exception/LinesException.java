package com.szkj.common.exception;

public class LinesException extends Exception{
	private static final long serialVersionUID = -2299443369229122943L;

	public LinesException() {
		super();
	}

	public LinesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public LinesException(String message, Throwable cause) {
		super(message, cause);
	}

	public LinesException(String message) {
		super(message);
	}

	public LinesException(Throwable cause) {
		super(cause);
	}
}
