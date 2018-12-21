package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Role;

public interface RoleService {

	/*
	 * 查询所有角色
	 */
	public List<Role> queryRoleAll();
	
	/*
	 * 添加角色
	 */
	public void addRole(Role role,Integer[] privilegeIds);
	
	/*
	 * 跟新角色的权限
	 */
	public void updateRolePrivilegeRelation(Integer roleId,Integer[] privilegeIds);
}
