package kr.co.pro.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.pro.entity.User;
import kr.co.pro.service.DwUserService;

@Controller
public class DwUserController {
	@Autowired DwUserService service;
	@GetMapping("/")
	public String home() {
		return "Dw/userHome";
	}
	@GetMapping("/joinhome")
	public String joinhome() {
		System.out.println("가입페이지로 이동");
		return "Dw/join";
	}
	@GetMapping("/userHome")
	public String userHome(Principal principal, Model model) {
		model.addAttribute("id", principal.getName());
		System.out.println("로그인페이지로 이동");
		return "Dw/userHome";
	}
	@GetMapping("/loginpage")
	public String login() {
		System.out.println("로그인페이지로 이동");
		return "Dw/login";
	}
	
	@PostMapping("/join")
	public String join(@ModelAttribute User user) {
		System.out.println("가입진행 1-1 Controller");
		System.out.println(user.toString());
		return service.join(user);
	}
	
	@PostMapping("/userInfoUpdateHome")
	public ModelAndView userInfoUpdateHome(@ModelAttribute User user,ModelAndView modelview) {
		modelview=service.userGetInfo(user);
		return modelview;
	}
	@GetMapping("/login")
	public ModelAndView login(
		@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "페스워드나 아이디가 올바르지 않습니다.");
		}
		if (logout != null) {
			model.addObject("msg", "로그아웃이 실패하였습니다.");
		}
		model.setViewName("Dw/login");
		return model;
	}	

}
	