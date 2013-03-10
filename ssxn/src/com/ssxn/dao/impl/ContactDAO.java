package com.ssxn.dao.impl;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IContactDAO;
import com.ssxn.model.Contact;
import com.ssxn.support.BaseDAO;
@Component
public class ContactDAO extends BaseDAO<Contact, Integer> implements IContactDAO {

}
