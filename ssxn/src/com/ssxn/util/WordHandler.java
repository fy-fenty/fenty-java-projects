package com.ssxn.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class WordHandler {
	private static Configuration configuration = null;

	public static String root = null;
	public static boolean fileDelete = true;

	static {
		InputStream in = null;
		try {
			configuration = new Configuration();
			configuration.setDefaultEncoding("utf-8");
			configuration.setClassForTemplateLoading(WordHandler.class, "/com/ronghai/hfms/util/framework");
			in = WordHandler.class.getClassLoader().getResourceAsStream("application.properties");
			Properties properties = new Properties();
			properties.load(in);
			root = properties.getProperty("print.outfile.root");
			fileDelete = Boolean.parseBoolean(properties.getProperty("print.fileDelete"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static String createDoc(Map<String, String> map, String templateName) throws Exception {
		String filename = null;
		Writer out = null;
		File outFile = null;
		try {
			filename = UUID.randomUUID().toString().replaceAll("-", "");

			File parent = new File(root);
			if (!parent.exists()) {
				parent.mkdirs();
			}
			outFile = new File(root + File.separator + filename + ".doc");
			Template template = configuration.getTemplate(templateName);
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "utf-8"));
			template.process(map, out);
			out.flush();
		} finally {
			if (out != null) {
				out.close();
			}
		}
		return filename;
	}
}
