package com.how2java.mapper;

import java.util.List;

import com.how2java.pojo.Privilege;


public interface PrivilegeMapper {

	public Privilege findPrivilegeById(Integer privilegeId);

	public void savePrivilege(Privilege privilege);

	public void updatePrivilege(Privilege privilege);

	public void deletePrivilegeById(Integer privilegeId);

	public List<Privilege> queryPrivilegeByWhere(Privilege record);
}
