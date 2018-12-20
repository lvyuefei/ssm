package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Privilege;


public interface PrivilegeService {

	public Privilege findPrivilegeById(Integer privilegeId);

	public void addPrivilege(Privilege privilege);

	public void updatePrivilege(Privilege privilege);

	public void deletePrivilegeById(Integer privilegeId);

	public List<Privilege> queryPrivilegeAll();
}
