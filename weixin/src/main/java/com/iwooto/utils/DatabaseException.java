package com.iwooto.utils;

public class DatabaseException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6737633994981490L;

    public DatabaseException() {
        super();
    }
    public DatabaseException(String message) {
        super(message);
    }
    public DatabaseException(String message, Throwable cause) {
        super(message, cause);
    }
    public DatabaseException(Throwable cause) {
        super(cause);
    }
}
