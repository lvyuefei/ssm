package com.how2java.controller;
 
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
import com.how2java.pojo.Privilege;
import com.how2java.service.PrivilegeService;
 
// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class PrivilegeController {
    @Autowired
    PrivilegeService privilegeService;
 
    @RequestMapping("listprivilege")
    public ModelAndView listPrivilege(){
        ModelAndView mav = new ModelAndView();
        List<Privilege> ps= privilegeService.queryPrivilegeAll();
         
        // 放入转发参数
        mav.addObject("ps", ps);
        // 放入jsp路径
        mav.setViewName("listprivilege");
        return mav;
    }
 
    @RequestMapping("addPrivilegePage")
    public ModelAndView addPrivilegePage() {
    	
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
    
    @RequestMapping("updatePrivilegePage")
    public ModelAndView updatePage(HttpServletRequest request) {
    	
    	ModelAndView mav4=new ModelAndView();
    	
    	String id=request.getParameter("id");
    	
    	Privilege privilege=privilegeService.findPrivilegeById(Integer.valueOf(id));
    	
    	mav4.addObject("p", privilege);
    	
    	mav4.setViewName("updateprivilege");
    	
    	return mav4;
    }
    
    @RequestMapping("updateprivilege")
    public ModelAndView updatePrivilege(Privilege privilege) {
    	  	
    	privilegeService.updatePrivilege(privilege);
    	
    	ModelAndView mav5 = new ModelAndView("redirect:/listprivilege");
        
    	return mav5;
    	
    } 
    
    @RequestMapping("deleteprivilege")
    public ModelAndView deletePrivilege(HttpServletRequest request) {
    	
    	String id=request.getParameter("id");
    	
    	privilegeService.deletePrivilegeById(Integer.valueOf(id));
    	
    	ModelAndView mav6=new ModelAndView("redirect:/listprivilege");
    	
    	return mav6;
    }
}
