package org.demo.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONSerializer;

import org.apache.struts2.ServletActionContext;

public class Struts2Utils {
	public static void renderHtml(boolean success, Object data) throws IOException {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		try {
			if (!success) {
				Map<String, Object> values = new HashMap<String, Object>();
				values.put("success", false);
				values.put("errMsg", data);
				response.getWriter().write(JSONSerializer.toJSON(values).toString());
			} else {
				response.getWriter().write(JSONSerializer.toJSON(data).toString());
			}
		} catch (Exception e) {
		} finally {
			response.getWriter().flush();
		}
	}
}