package org.fengyao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.fengyao.jobs.aa;
import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

public class Test {
	public static void main(String[] args) throws SchedulerException, IOException, ParseException {
		Calendar cad = Calendar.getInstance();
		cad.add(Calendar.WEDNESDAY, -1);
		cad.add(Calendar.DATE, Calendar.DAY_OF_WEEK - cad.get(Calendar.DAY_OF_WEEK));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dataStr = sdf.format(cad.getTime());
		System.out.println(dataStr);
	}
}