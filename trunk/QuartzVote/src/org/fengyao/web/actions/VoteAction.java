package org.fengyao.web.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

public class VoteAction {
	public String execute() {
		System.out.println("a");
		HttpServletResponse response = ServletActionContext.getResponse();
		Calendar cad = Calendar.getInstance();
		cad.add(Calendar.WEDNESDAY, -1);
		cad.add(Calendar.DATE, Calendar.DAY_OF_WEEK - cad.get(Calendar.DAY_OF_WEEK));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dataStr = sdf.format(cad.getTime());
		String filePath = ServletActionContext.getServletContext().getRealPath(File.separator) + "WEB-INF"
				+ File.separator + "VoteReport-" + dataStr + ".xls";
		System.out.println(filePath);
		try {
			File f = new File(filePath);
			response.setContentType("application/vnd.ms-excel");
			response.setHeader("Content-Disposition", "attachment;filename=VoteReport.xls");
			OutputStream os = response.getOutputStream();
			InputStream is = new FileInputStream(f);
			byte[] b = new byte[(int) f.length()];
			is.read(b);
			os.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}