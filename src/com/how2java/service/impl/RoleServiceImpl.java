package com.how2java.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.RoleMapper;
import com.how2java.pojo.Role;
import com.how2java.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleMapper roleMapper;
	
	@Override
	public List<Role> queryRoleAll() {
		// TODO Auto-generated method stub
		return roleMapper.queryRoleByWhere(null);
	}

	@Override
	public void addRole(Role role,Integer[] privilegeIds) {
		
		roleMapper.addRole(role);
		
		//维护角色和权限的关系
		if(privilegeIds!=null) {
			this.updateRolePrivilegeRelation(role.getId(), privilegeIds);
		}
	}

	@Override
	public void updateRolePrivilegeRelation(Integer roleId, Integer[] privilegeIds) {
		
		if(roleId==null) {
			return;
		}
		if (privilegeIds==null) {
			return;
		}
		
		//1.解除角色原来的权限
		roleMapper.deleteRolePrivilegeRelation(roleId);
		
		//2.添加角色的权限
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		map.put("roleId", roleId);
		
		for(Integer pid:privilegeIds) {
			
			map.put("privilegeId", pid);
			
			roleMapper.insertRolePrivilegeRelation(map);
			
		}
	}

}
