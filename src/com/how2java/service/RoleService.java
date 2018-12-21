package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Role;

public interface RoleService {

	/*
	 * ��ѯ���н�ɫ
	 */
	public List<Role> queryRoleAll();
	
	/*
	 * ��ӽ�ɫ
	 */
	public void addRole(Role role,Integer[] privilegeIds);
	
	/*
	 * ���½�ɫ��Ȩ��
	 */
	public void updateRolePrivilegeRelation(Integer roleId,Integer[] privilegeIds);
}
