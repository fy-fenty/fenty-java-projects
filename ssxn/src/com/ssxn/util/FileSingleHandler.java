package com.ssxn.util;

import java.io.IOException;
import java.util.Properties;

public class FileSingleHandler {
	private static Properties pro;

	public static Properties getProp(String fileName) {
		if (pro == null) {
			pro = new Properties();
			try {
				pro.load(FileSingleHandler.class.getResourceAsStream(fileName));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return pro;
	}

	public static void main(String[] args) {
		Properties p = getProp(MyException.clientError);
		System.out.println(p);
	}
}
