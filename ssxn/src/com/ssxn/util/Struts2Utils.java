package com.ssxn.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

public class Struts2Utils {
	protected static Logger logger = Logger.getLogger(Struts2Utils.class);

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
			logger.error(e);
		} finally {
			response.getWriter().flush();
		}
	}

	public static void renderDocStream(String filename) throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/msword");
		response.setHeader("Content-Disposition", "attachment;filename=" + filename + ".doc");
		response.addHeader("Cache-Control", "no-cache");
		File file = new File(WordHandler.root + File.separator + filename.trim() + ".doc");
		if (!file.exists()) {
			return;
		}
		InputStream blobStream = null;
		byte[] buffer = null;
		try {
			blobStream = new FileInputStream(file);
			OutputStream outStream = response.getOutputStream();
			buffer = new byte[2048];
			int nbytes = -1;
			while ((nbytes = blobStream.read(buffer)) != -1) {
				outStream.write(buffer, 0, nbytes);
			}
			outStream.flush();
		} finally {
			buffer = null;
			if (blobStream != null) {
				blobStream.close();
				blobStream = null;
			}
		}
		if (WordHandler.fileDelete) {
			file.delete();
		}

	}
}
