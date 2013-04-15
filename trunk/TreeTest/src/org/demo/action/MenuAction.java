package org.demo.action;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.demo.model.Menu;
import org.demo.service.IMenuService;
import org.demo.util.Struts2Utils;

public class MenuAction {
	@Resource
	private IMenuService menuService;
	private Menu menu;
	private Integer id;

	public String getById() {
		try {
			if (id == null) {
				Struts2Utils.renderHtml(false, "错误的请求!");
				return null;
			}
			Menu menu = menuService.findById(id);
			Struts2Utils.renderHtml(true, menu);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String findByParent() {
		try {
			if (id == null) {
				Struts2Utils.renderHtml(false, "错误的请求!");
				return null;
			}
			List<Menu> menus = menuService.findMenusByParent(id);
			Struts2Utils.renderHtml(true, menus);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String findAll() {
		List<Menu> menus = menuService.findAllMenus();
		try {
			Struts2Utils.renderHtml(true, menus);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public IMenuService getMenuService() {
		return menuService;
	}

	public void setMenuService(IMenuService menuService) {
		this.menuService = menuService;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
