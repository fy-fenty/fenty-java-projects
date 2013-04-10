package com.ssxn.dao.impl;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IMuserDAO;
import com.ssxn.model.Muser;
import com.ssxn.support.BaseDAO;

@Component
public class MuserDAO extends BaseDAO<Muser, Integer> implements IMuserDAO {

}
