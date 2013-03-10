package com.ssxn.util;

public class MyException extends Exception {
	public static final String LoginFailed = "LoginFailed";
	public static final String LoginIsNull = "LoginIsNull";
	public static final String NoContact = "NoContact";
	private static final String errFileName = "/Error.properties";

	public static String getError(String errKey) {
		return FileSingleHandler.getProperties(errFileName).getProperty(errKey);
	}

	private static final long serialVersionUID = 1L;

	public MyException(String msg) {
		super(msg);
	}
}