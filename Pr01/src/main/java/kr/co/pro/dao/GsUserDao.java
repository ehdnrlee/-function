package kr.co.pro.dao;

import kr.co.pro.entity.*;

public interface GsUserDao {
	public int insertUser(User user);
	public int insertAuthorities(Authorities authorities);
}
