package com.ssxn.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ssxn.model.Contact;
import com.ssxn.model.Muser;
import com.ssxn.service.IContactService;
import com.ssxn.service.IIdentityService;
import com.ssxn.service.IMuserService;
import com.ssxn.support.BaseVO;
import com.ssxn.util.MyException;
import com.ssxn.util.Struts2Utils;
import com.ssxn.vo.LoginVo;

public class UserAction {
	public static String SESSION_USER = "users";
	private String identity;
	private LoginVo lv;
	private BaseVO bv;
	@Resource
	private IMuserService muserService;
	@Resource
	private IContactService contactService;
	@Resource
	private IIdentityService identityService;

	public String login() {
		lv = new LoginVo();
		lv.setUname("member");
		lv.setUpwd("AA8769CDCB26674C6706093503FF0A3");
		List<Muser> user = muserService.findMuserByName(lv.getUname());
		HttpServletRequest req = ServletActionContext.getRequest();
		req.getSession().setAttribute(UserAction.SESSION_USER, user.get(0));
		// if (lv == null) {
		// req.setAttribute("err",
		// MyException.getError(MyException.LoginIsNull));
		// return "login";
		// }
		// if ("".equals(lv.getUname().trim()) || "".equals(lv.getUpwd())) {
		// req.setAttribute("uname", lv.getUname());
		// req.setAttribute("err",
		// MyException.getError(MyException.LoginIsNull));
		// return "login";
		// }
		// List<Muser> users =
		// this.getMuserService().findMuserByNameForLogin(lv.getUname());
		// if (users.size() == 0) {
		// req.setAttribute("uname", lv.getUname());
		// req.setAttribute("err",
		// MyException.getError(MyException.LoginFailed));
		// return "login";
		// }
		// if (!users.get(0).getUpwd().equals(StringUtils.getMD5(lv.getUpwd())))
		// {
		// req.setAttribute("uname", lv.getUname());
		// req.setAttribute("err",
		// MyException.getError(MyException.LoginFailed));
		// return "login";
		// }
		// Muser user = users.get(0);
		// req.getSession().setAttribute(UserAction.SESSION_USER, user);
		this.identity = "member";
		return "success";
	}

	public void register() {
		contactService.findContactByUid(0);
		Muser mu = new Muser();
		mu.setUname(lv.getUname());
		mu.setUpwd(lv.getUpwd());
		this.getMuserService().saveMuser(mu);
	}

	public String edit() {
		contactService.findContactByUid(0);
		HttpServletRequest req = ServletActionContext.getRequest();
		Muser user = (Muser) req.getSession().getAttribute(UserAction.SESSION_USER);
		List<Contact> c = contactService.findContactByUid(user.getUid());
		if (c.size() <= 0) {
			Struts2Utils.renderHtml(false, MyException.getError(MyException.NoContact));
		} else {
			Struts2Utils.renderHtml(true, c);
		}
		return null;
	}

	public IMuserService getMuserService() {
		return muserService;
	}

	public void setMuserService(IMuserService muserService) {
		this.muserService = muserService;
	}

	public LoginVo getLv() {
		return lv;
	}

	public void setLv(LoginVo lv) {
		this.lv = lv;
	}

	public BaseVO getBv() {
		return bv;
	}

	public void setBv(BaseVO bv) {
		this.bv = bv;
	}

	public IIdentityService getIdentityService() {
		return identityService;
	}

	public void setIdentityService(IIdentityService identityService) {
		this.identityService = identityService;
	}

	public IContactService getContactService() {
		return contactService;
	}

	public void setContactService(IContactService contactService) {
		this.contactService = contactService;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

}