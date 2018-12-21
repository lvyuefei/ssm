package com.how2java.mapper;

import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;

import com.how2java.pojo.Role;

public interface RoleMapper {

	/*
	 * 查询所有角色
	 */
	public List<Role> queryRoleByWhere(Role record);
	
	/*
	 * 添加角色
	 */
	public void addRole(Role role);
	
	/*
	 * 为角色添加权限，更新角色权限表
	 */
	public void insertRolePrivilegeRelation(Map<String, Integer> parameter);
	
	/*
	 * 修改更新角色信息
	 */
	public void updateRole(Role role);
	
	/*
	 *根据角色id 删除角色与权限的对应关系 
	 */
	public void deleteRolePrivilegeRelation(Integer roleId);
	
	/*
	 * 删除角色
	 */
	public void deleteRoleByRoleId(Integer roleId);
}
