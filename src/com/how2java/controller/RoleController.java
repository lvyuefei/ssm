package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Privilege;
import com.how2java.pojo.Role;
import com.how2java.service.PrivilegeService;
import com.how2java.service.RoleService;

@Controller
@RequestMapping("")
public class RoleController {

	@Autowired
	RoleService roleService;
	
	@Autowired
	PrivilegeService privilegeService;
	
	@RequestMapping("listRolePage")
	public ModelAndView listRolePage() {
		ModelAndView mav1=new ModelAndView();
		
		List<Role> rs=roleService.queryRoleAll();
		
		mav1.addObject("rs", rs);
		
		mav1.setViewName("listrole");
		
		return mav1;
	}
	
	@RequestMapping("addRolePage")
	public ModelAndView addRolePage() {
		
		ModelAndView mav2=new ModelAndView();
		
		List<Privilege> privileges=privilegeService.queryPrivilegeAll();
		
		mav2.addObject("privileges", privileges);
		
		mav2.setViewName("addrole");
		
		return mav2;
	}
	
	@RequestMapping("addRole")
	public ModelAndView addRole(Role role,Integer[] privilegeIds) {
		
		roleService.addRole(role, privilegeIds);
		
		ModelAndView mav3=new ModelAndView("redirect:/listrole");
		
		return mav3;
	}
}
