package com.ssxn.util;

import java.util.regex.Pattern;

public class RegexUtils {
	public static Boolean isNumber(String str) {
		return Pattern.matches("^\\d+$", str);
	}
	
	public static void main(String[] args) {
		System.out.println(isNumber("123a"));
	}
}
