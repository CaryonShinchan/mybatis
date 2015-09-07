package com.shinchan.mybatis;

import org.apache.ibatis.session.SqlSession;

import com.shinchan.mybatis.dao.UserDao;
import com.shinchan.mybatis.domain.User;
import com.shinchan.mybatis.utils.MBSF;

public class App {

	public static void main(String args[]) {

		SqlSession session = MBSF.getSqlSession();
		UserDao userDao = session.getMapper(UserDao.class);
		User user = userDao.getUserById(1);
		System.out.println(user.getName() + "---->" + user.getAge());
	}
}
