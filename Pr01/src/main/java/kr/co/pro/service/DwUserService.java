package kr.co.pro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.pro.dao.DwUserDao;
import kr.co.pro.entity.User;

@Service
public class DwUserService {
	@Autowired DwUserDao dao;
	public String join(User users) {
		String result;
		System.out.println("가입 서비스과정");
		if(dao.joinuser(users)>0) {
			result="home";
		}
		else {
			result="Dw/join";
		}
		return result;
	}
}
