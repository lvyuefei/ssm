package com.how2java.service.impl;

import java.util.List;

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
		return roleMapper.queryRoleAll();
	}

}
