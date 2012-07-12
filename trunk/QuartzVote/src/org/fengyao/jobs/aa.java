package org.fengyao.jobs;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class aa implements Job {

	static Log logger = LogFactory.getLog(aa.class);

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("a");
	}
}