package com.ssxn.service;

import java.util.List;

import com.ssxn.model.Contact;

public interface IContactService {
	public Contact getContactById(Integer cid);

	public void saveContact(Contact con);

	public List<Contact> findContactByUid(Integer uid);
}