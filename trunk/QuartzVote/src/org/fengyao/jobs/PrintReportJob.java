package org.fengyao.jobs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.fengyao.services.IVoteService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerException;
import org.springframework.web.context.WebApplicationContext;

public class PrintReportJob implements Job {

	static Log logger = LogFactory.getLog(PrintReportJob.class);

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("-------------------------------Start PrintReportJob-------------------------------");
		ServletContext ctx;
		try {
			ctx = (ServletContext) context.getScheduler().getContext().get("ctx");
			WebApplicationContext ctc = (WebApplicationContext) ctx
					.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
			IVoteService ivs = ctc.getBean("vote_service", IVoteService.class);
			List votes = ivs.getVoteTable();
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet s = wb.createSheet("vote_report");
			HSSFCellStyle cs = wb.createCellStyle();
			s.setColumnWidth(1, (short) 6000);
			HSSFRow r = s.createRow(0);
			HSSFCell cell = r.createCell(0);
			cell.setCellValue("投票标题");
			cell = r.createCell(1);
			cell.setCellValue("投票内容");
			cell = r.createCell(2);
			cell.setCellValue("参加人数");
			logger.info("共有" + votes.size());
			for (int rownum = 0; rownum < votes.size(); rownum++) {
				r = s.createRow(rownum + 1);
				List<String> vals = (List) votes.get(rownum);
				for (int i = 0; i < vals.size(); i++) {
					cell = r.createCell(i);
					cell.setCellStyle(cs);
					cell.setCellValue(vals.get(i));
				}
			}
			FileOutputStream out;
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String dataStr = sdf.format(new Date());
				String filePath = ctx.getRealPath("/") + "WEB-INF/VoteReport-" + dataStr + ".xls";
				out = new FileOutputStream(filePath);
				wb.write(out);
				out.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("-------------------------------Stop PrintReportJob-------------------------------");
	}
}