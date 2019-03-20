package kr.co.pro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.pro.dao.DwUserDao;
import kr.co.pro.entity.User;

@Service
public class DwUserService {
	@Autowired DwUserDao dao;
	User user;
	public String test() {
		
		return dao.joinuser(user);
	}
}
