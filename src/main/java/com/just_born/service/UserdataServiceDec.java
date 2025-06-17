package com.just_born.service;

import java.util.List;

import com.just_born.entity.Userdata;

public interface UserdataServiceDec {
	public List<Userdata> alluserdata();

	public Userdata byid(int userdata_id);

	public void insetandupdate(Userdata userdata);

	public void delete(int userdata_id);
	
	public List<Userdata> search(String data);
	
	public List<Userdata> search(int data);
}
