package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.PrivilegeMapper;
import com.how2java.pojo.Privilege;
import com.how2java.service.PrivilegeService;


@Service
public class PrivilegeServiceImpl implements PrivilegeService{

	@Autowired
	PrivilegeMapper privilegeMapper;
	
	@Override
	public Privilege findPrivilegeById(Integer privilegeId) {
		
		return privilegeMapper.findPrivilegeById(privilegeId);
		
		
	}

	@Override
	public void addPrivilege(Privilege privilege) {
	
		privilegeMapper.savePrivilege(privilege);
		
		
	}

	@Override
	public void deletePrivilegeById(Integer privilegeId) {
		
		privilegeMapper.deletePrivilegeById(privilegeId);
		
	}

	

	@Override
	public void updatePrivilege(Privilege privilege) {
		privilegeMapper.updatePrivilege(privilege);
		
		
	}

	@Override
	public List<Privilege> queryPrivilegeAll() {
		return privilegeMapper.queryPrivilegeByWhere(null);
	
	}

	
}
