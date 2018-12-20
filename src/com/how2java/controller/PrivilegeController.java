package com.how2java.controller;
 
import java.util.List;

import org.junit.validator.PublicClassValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
import com.how2java.pojo.Privilege;
import com.how2java.service.PrivilegeService;
 
// ����spring mvc����һ����������
@Controller
@RequestMapping("")
public class PrivilegeController {
    @Autowired
    PrivilegeService privilegeService;
 
    @RequestMapping("listprivilege")
    public ModelAndView listPrivilege(){
        ModelAndView mav = new ModelAndView();
        List<Privilege> ps= privilegeService.queryPrivilegeAll();
         
        // ����ת������
        mav.addObject("ps", ps);
        // ����jsp·��
        mav.setViewName("listprivilege");
        return mav;
    }
 
    @RequestMapping("add")
    public ModelAndView add() {
    	
    	ModelAndView mav2=new ModelAndView();
    	
    	mav2.setViewName("addprivilege");
    	
    	return mav2;
    }
    
    @RequestMapping("addprivilege")
    public ModelAndView addPrivilege(Privilege privilege) throws Exception{
    	
    	privilegeService.addPrivilege(privilege);
    	 ModelAndView mav3 = new ModelAndView("redirect:/listprivilege");
     
    	return mav3;
    	
    }
    
    @RequestMapping("update")
    public ModelAndView update() {

    	ModelAndView mav4=new ModelAndView();
    	
    	mav4.setViewName("updateprivilege");
    	
    	return mav4;
    }
}
