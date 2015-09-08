package com.shinchan.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.shinchan.mybatis.dao.UserDao;
import com.shinchan.mybatis.domain.User;
import com.shinchan.mybatis.utils.MBSF;

public class App {

	public static void main(String args[]) {

		SqlSession session = MBSF.getSqlSession();
		UserDao userDao = session.getMapper(UserDao.class);
		
		//根据id查找用户
//		User user = userDao.getUserById(2);
//		System.out.println(user.getName() + "---->" + user.getAge());
		
		//查找全部用户
//		List<User> userList = userDao.getAllUser();
//		for (User user : userList) {
//			System.out.println(user.getName() + "---->" + user.getAge());
//		}
		
		//添加用户
//		User user = new User("lihong3", 19, "18910376528");
//		userDao.addUser(user);
//		session.commit();
//		session.close();
		
		//删除用户
//		userDao.deleteUserById(6);
//		session.commit();
//		session.close();
		
		//修改用户
//		User user = new User(6, "李红", 23, "18910376528");
//		userDao.updateUserById(user);
//		session.commit();
//		session.close();
	}
}
