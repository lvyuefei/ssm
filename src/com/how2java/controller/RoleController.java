package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Role;
import com.how2java.service.RoleService;

@Controller
@RequestMapping("")
public class RoleController {

	@Autowired
	RoleService roleService;
	
	@RequestMapping("listRolePage")
	public ModelAndView listRolePage() {
		ModelAndView mav1=new ModelAndView();
		
		List<Role> rs=roleService.queryRoleAll();
		
		mav1.addObject("rs", rs);
		
		mav1.setViewName("listrole");
		
		return mav1;
	}
}
