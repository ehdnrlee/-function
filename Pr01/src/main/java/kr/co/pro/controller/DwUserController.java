package kr.co.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.pro.service.DwUserService;

@Controller
public class DwUserController {
	@Autowired DwUserService service;
	
	@RequestMapping(value="/joinhome", method= RequestMethod.POST)
	public String joinHome(Model model) {
		System.out.println("Home Controller");
		
		
		
		return "home";
		
	}
	

}
	