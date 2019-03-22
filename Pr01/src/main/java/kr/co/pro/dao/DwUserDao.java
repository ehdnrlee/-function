package kr.co.pro.dao;
import org.springframework.beans.factory.annotation.Autowired;

import kr.co.pro.entity.User;
public interface DwUserDao {
	public int joinUser(User user);
	public String selectPwd(String id);
	public User userGetInfo(String id);
}

