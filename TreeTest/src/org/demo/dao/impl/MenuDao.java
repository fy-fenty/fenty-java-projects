package org.demo.dao.impl;

import org.demo.dao.IMenuDao;
import org.demo.model.Menu;
import org.springframework.stereotype.Component;

@Component
public class MenuDao extends BaseDao<Menu, Integer> implements IMenuDao {
}
