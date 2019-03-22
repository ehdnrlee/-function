package kr.co.pro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import kr.co.pro.dao.DwUserDao;
import kr.co.pro.entity.User;

@Service
public class DwUserService {
	
	@Autowired DwUserDao dao;
	@Autowired BCryptPasswordEncoder passwordEncoder;


	
	public String join(User users) {
		String result;
		users.setPwd(passwordEncoder.encode(users.getPwd()));
		System.out.println("가입 서비스과정");
		if(dao.joinUser(users)>0) {
			result="Dw/userHome";
		}
		else {
			result="Dw/join";
		}
		return result;
	}
	public boolean pwdCheck(String id,String pwd) {
		return passwordEncoder.matches(pwd,dao.selectPwd(id));
	}
	public ModelAndView userGetInfo(User users) {
		ModelAndView modelview = new ModelAndView();;
		if(pwdCheck(users.getId(),users.getPwd())) {
			User userInfo=dao.userGetInfo(users.getId());
			modelview.addObject(userInfo);
			modelview.setViewName("Dw/userInfoUpdateHome");
		}else {
			modelview.setViewName("Dw/userHome");
		}
		
		return modelview;
	}
}
