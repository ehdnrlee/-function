package kr.co.pro.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import kr.co.pro.dao.*;
import kr.co.pro.entity.*;
@Service
public class GsUserService {
	@Autowired GsUserDao dao;
	public void join(User user) {
		dao.insertUser(user);
		Authorities authorities = new Authorities();
		authorities.setId(user.getId());
		authorities.setAuthority("ROLE_USER");
		dao.insertAuthorities(authorities);
	}


}
