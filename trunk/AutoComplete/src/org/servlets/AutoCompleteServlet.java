package org.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONSerializer;

public class AutoCompleteServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AutoCompleteServlet() {
		super();
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *           the request send by the client to the server
	 * @param response
	 *           the response send by the server to the client
	 * @throws ServletException
	 *            if an error occurred
	 * @throws IOException
	 *            if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("-------------------------------this is server-------------------------------");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
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
		String input = request.getParameter("q");
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
		out.print(jsonArray.toString());
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request
	 *           the request send by the client to the server
	 * @param response
	 *           the response send by the server to the client
	 * @throws ServletException
	 *            if an error occurred
	 * @throws IOException
	 *            if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}