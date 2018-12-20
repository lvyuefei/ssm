package com.how2java.mapper;

import java.util.List;

import com.how2java.pojo.Privilege;


public interface PrivilegeMapper {

	/*
	 * ͨ��Ȩ��id��ѯȨ������
	 */
	public Privilege findPrivilegeById(Integer privilegeId);

	/**
	 * ����Ȩ��
	 * @param privilege
	 */
	public void savePrivilege(Privilege privilege);

	/**
	 * ����Ȩ������
	 * @param privilege
	 */
	public void updatePrivilege(Privilege privilege);

    /*
     * ͨ��Ȩ��idɾ��Ȩ������
     */
	public void deletePrivilegeById(Integer privilegeId);

	/*
	 * ��ѯ����Ȩ��
	 */
	public List<Privilege> queryPrivilegeByWhere(Privilege record);
	
	/*
	 * ͨ����ɫid���Ҷ�ӦȨ��
	 */
	public List<Privilege> queryPrivilegeByRoleId(Integer roleId);
}
