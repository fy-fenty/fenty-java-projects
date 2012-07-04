package org.fengyao.web.actions;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.fengyao.entities.PageBean;
import org.fengyao.services.IMuserService;
import org.fengyao.vos.PageVo;
import org.springframework.web.context.WebApplicationContext;

public class MuserAction {
	private IMuserService muserService;
	private PageVo pageVo = new PageVo();

	public String login() {
		PrintWriter out = null;
		try {
			out = ServletActionContext.getResponse().getWriter();
			Map<String, Object> mp = new HashMap<String, Object>();
			mp.put("result", "0000");
			out.print(new JSONObject().fromObject(mp));
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String page() {
		PrintWriter out = null;
		try {
			out = ServletActionContext.getResponse().getWriter();
			System.out.println(pageVo.getStart() + "\t" + pageVo.getLimit());
			PageBean pageBean = muserService.getPageBean(pageVo.getStart(), pageVo.getLimit());
			System.out.println(pageBean);
			Map<String, Object> mp = new HashMap<String, Object>();
			mp.put("data", pageBean.getList());
			mp.put("currentPage", pageBean.getCurrentPage());
			mp.put("totalPage", pageBean.getTotalPage());
			mp.put("nextPage", pageBean.getNextPage());
			mp.put("prevPage", pageBean.getPrevPage());
			mp.put("totalResults", pageBean.getTotalResults());
			JSONObject obj = JSONObject.fromObject(mp);
			System.out.println(obj);
			out.print(obj);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public PageVo getPageVo() {
		return pageVo;
	}

	public void setPageVo(PageVo pageVo) {
		this.pageVo = pageVo;
	}

	public IMuserService getMuserService() {
		return muserService;
	}

	public void setMuserService(IMuserService muserService) {
		this.muserService = muserService;
	}
}