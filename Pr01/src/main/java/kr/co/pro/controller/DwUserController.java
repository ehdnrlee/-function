package kr.co.pro.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.pro.service.DwUserService;
import kr.co.pro.entity.User;

@Controller
public class DwUserController {
	@Autowired DwUserService service;
	@GetMapping("/joinhome")
	public String joinhome() {
		System.out.println("가입페이지로 이동");
		return "Dw/join";
	}
	
	@PostMapping("/join")
	public String join(@ModelAttribute User user) {
		System.out.println("가입진행 1-1 Controller");
		System.out.println(user.toString());
		return service.join(user);
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
}
	