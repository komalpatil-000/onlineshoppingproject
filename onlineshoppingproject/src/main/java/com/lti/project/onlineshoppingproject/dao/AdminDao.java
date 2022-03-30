package com.lti.project.onlineshoppingproject.dao;

import java.util.List;

import com.lti.project.onlineshoppingproject.beans.Admin;
import com.lti.project.onlineshoppingproject.exceptions.AdminException;




public interface AdminDao {
	
	public abstract int addNewAdmin(Admin a);

	public abstract Admin findAdminById(int aId) throws AdminException;
	
	public abstract long updateContact(int aId,long contact);
	
	public abstract void deleteRecord(int aId);
	
	public abstract List<Admin> adminList();
	
	

}
