package org.fengyao.test;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.apache.poi.hslf.model.TextBox;

public class Test {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String a = "标        题  ：	Metro乐团纯人声无伴奏演绎《海阔天空》";
		String b = "http://slide.ent.sina.com.cn/y/slide_4_703_42140.html";
		System.out.println(a.getBytes("GBK").length);
		System.out.println(b.getBytes("GBk").length);
//		String s = URLEncoder.encode(a, "Unicode");
//		String x = URLEncoder.encode(b, "Unicode");
//		System.out.println(a.length() + "\t" + b.length());
//		System.out.println(s.length() + "\t" + x.length());
	}
}
