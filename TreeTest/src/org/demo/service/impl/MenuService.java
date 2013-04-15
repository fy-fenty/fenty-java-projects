package org.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.demo.dao.IMenuDao;
import org.demo.model.Menu;
import org.demo.service.IMenuService;
import org.springframework.stereotype.Component;

@Component
public class MenuService implements IMenuService {

	@Resource
	private IMenuDao menuDao;

	@Override
	public Menu findById(Integer id) {
		if (id != null) {
			return menuDao.getById(id);
		} else {
			return null;
		}
	}

	@Override
	public boolean saveMenu(Menu menu) {
		if (menu != null) {
			menuDao.add(menu);
			return true;
		}
		return false;
	}

	@Override
	public boolean delMenu(Menu menu) {
		if (menu != null) {
			menuDao.del(menu);
			return true;
		}
		return false;
	}

	@Override
	public List<Menu> findMenusByParent(Integer id) {
		if (id != null) {
			return menuDao.findByHql("from Menu where menuParent = ?", id);
		}
		return null;
	}

	@Override
	public List<Menu> findAllMenus() {
		return menuDao.findAll();
	}

	public IMenuDao getMenuDao() {
		return menuDao;
	}

	public void setMenuDao(IMenuDao menuDao) {
		this.menuDao = menuDao;
	}

}
