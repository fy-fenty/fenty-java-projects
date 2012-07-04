package org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sf.json.JSONArray;
import net.sf.json.JSONSerializer;

public class Test {
	public void Reg(String input) {
		List list = new ArrayList();
		list.add("ActionScript");
		list.add("AppleScript");
		list.add("Asp");
		list.add("BASIC");
		list.add("C");
		list.add("C++");
		list.add("Clojure");
		list.add("COBOL");
		list.add("ColdFusion");
		list.add("Erlang");
		list.add("Fortran");
		list.add("Groovy");
		list.add("Haskell");
		list.add("Java");
		list.add("JavaScript");
		list.add("Lisp");
		list.add("Perl");
		list.add("PHP");
		list.add("Python");
		list.add("Ruby");
		list.add("Scala");
		list.add("Scheme");
		List result = new LinkedList();
		Pattern pattern = Pattern.compile(input, Pattern.CASE_INSENSITIVE);
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			String str = (String) iterator.next();
			Matcher matcher = pattern.matcher(str);
			if (matcher.find()) {
				result.add(str);
			}
		}
		System.out.println("length of server's result: " + result.size());
		JSONArray jsonArray = (JSONArray) JSONSerializer.toJSON(result);
		System.out.println(jsonArray.toString());
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.Reg("c");
	}
}