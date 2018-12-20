package com.how2java.mapper;

import java.util.List;

import com.how2java.pojo.Privilege;


public interface PrivilegeMapper {

	/*
	 * 通过权限id查询权限内容
	 */
	public Privilege findPrivilegeById(Integer privilegeId);

	/**
	 * 保存权限
	 * @param privilege
	 */
	public void savePrivilege(Privilege privilege);

	/**
	 * 更新权限内容
	 * @param privilege
	 */
	public void updatePrivilege(Privilege privilege);

    /*
     * 通过权限id删除权限内容
     */
	public void deletePrivilegeById(Integer privilegeId);

	/*
	 * 查询所有权限
	 */
	public List<Privilege> queryPrivilegeByWhere(Privilege record);
	
	/*
	 * 通过角色id查找对应权限
	 */
	public List<Privilege> queryPrivilegeByRoleId(Integer roleId);
}
