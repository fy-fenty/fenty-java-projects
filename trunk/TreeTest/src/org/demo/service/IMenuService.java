package org.demo.service;

import java.util.List;

import org.demo.model.Menu;

public interface IMenuService {
	public Menu findById(Integer id);

	public boolean saveMenu(Menu menu);

	public boolean delMenu(Menu menu);
	
	public List<Menu> findMenusByParent(Integer id);
	
	public List<Menu> findAllMenus();
}
