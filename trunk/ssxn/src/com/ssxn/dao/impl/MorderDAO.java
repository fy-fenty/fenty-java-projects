package com.ssxn.dao.impl;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IMorderDAO;
import com.ssxn.model.Morder;
import com.ssxn.support.BaseDAO;
@Component
public class MorderDAO extends BaseDAO<Morder, Integer> implements IMorderDAO {

}
