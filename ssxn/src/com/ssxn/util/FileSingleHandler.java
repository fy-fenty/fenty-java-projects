package com.ssxn.util;

import java.io.IOException;
import java.util.Properties;

public class FileSingleHandler {
	private static Properties pro;

	public static Properties getProperties(String fileName) {
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
		Properties p = getProperties("/Error.properties");
		System.out.println(p);
	}
}
