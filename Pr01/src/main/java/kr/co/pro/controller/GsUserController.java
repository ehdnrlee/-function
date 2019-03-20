package kr.co.pro.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import kr.co.pro.entity.*;
import kr.co.pro.service.*;
@Controller
public class GsUserController {
	@Autowired GsUserService uService;
	@GetMapping("/gsjoin")
	public String join() {
		return "gs/join";
	}
	@PostMapping("/gsjoin")
	public String join(Model model, User user) {
		uService.join(user);
		return "redirect:/home.jsp";
	}
}
