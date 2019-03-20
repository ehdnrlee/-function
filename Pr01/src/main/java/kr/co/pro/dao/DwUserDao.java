package kr.co.pro.dao;
import org.springframework.beans.factory.annotation.Autowired;

import kr.co.pro.entity.User;
public interface DwUserDao {
	public int joinuser(User user);
}

