package com.ssxn.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StringUtils {
	public static String formatter(String str, Object... obj) {
		for (int i = 0; i < obj.length; i++) {
			str = str.replace("{" + (i + 1) + "}", obj[i] + "");
		}
		return str;
	}

	public static String getMD5(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes("UTF-8"));
			StringBuilder sb = new StringBuilder();
			for (byte b : md.digest()) {
				sb.append(String.format("%X", b));
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static String getWhileNeedDefault(String str, Object def) {
		if (def instanceof Integer) {

		}
		if (str == null || (str + "").length() == 0) {
			return def + "";
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(getWhileNeedDefault(null, "0"));
	}
}
