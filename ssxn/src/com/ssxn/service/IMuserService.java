package com.ssxn.service;

import java.util.List;

import com.ssxn.model.Muser;

public interface IMuserService {
	public Muser getMuserById(Integer uid);

	public void saveMuser(Muser mu);

	public List<Muser> findMuserByName(String uname);

}