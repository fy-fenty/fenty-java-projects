package com.ssxn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IContactDAO;
import com.ssxn.model.Contact;
import com.ssxn.service.IContactService;

@Component
public class ContactService implements IContactService {

	@Resource
	private IContactDAO contactDAO;

	@Override
	public Contact getContactById(Integer cid) {
		return contactDAO.get(cid);
	}

	@Override
	public void saveContact(Contact con) {
		contactDAO.save(con);
	}

	@Override
	public List<Contact> findContactByUid(Integer uid) {
		return contactDAO.find("from " + contactDAO.getTableName() + " where uid=?", uid);
	}

	public IContactDAO getContactDAO() {
		return contactDAO;
	}

	public void setContactDAO(IContactDAO contactDAO) {
		this.contactDAO = contactDAO;
	}
}