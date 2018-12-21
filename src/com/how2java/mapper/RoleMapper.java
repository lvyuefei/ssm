package com.how2java.mapper;

import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;

import com.how2java.pojo.Role;

public interface RoleMapper {

	/*
	 * ��ѯ���н�ɫ
	 */
	public List<Role> queryRoleByWhere(Role record);
	
	/*
	 * ��ӽ�ɫ
	 */
	public void addRole(Role role);
	
	/*
	 * Ϊ��ɫ���Ȩ�ޣ����½�ɫȨ�ޱ�
	 */
	public void insertRolePrivilegeRelation(Map<String, Integer> parameter);
	
	/*
	 * �޸ĸ��½�ɫ��Ϣ
	 */
	public void updateRole(Role role);
	
	/*
	 *���ݽ�ɫid ɾ����ɫ��Ȩ�޵Ķ�Ӧ��ϵ 
	 */
	public void deleteRolePrivilegeRelation(Integer roleId);
	
	/*
	 * ɾ����ɫ
	 */
	public void deleteRoleByRoleId(Integer roleId);
}
