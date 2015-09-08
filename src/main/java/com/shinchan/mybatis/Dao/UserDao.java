package com.shinchan.mybatis.dao;

import java.util.List;

import com.shinchan.mybatis.domain.User;

public interface UserDao {

	/**
	 * 通过id获取用户
	 * @param id
	 * @return
	 */
	public User getUserById(int id);

	/**
	 * 获取全部用户列表
	 * @return
	 */
	public List<User> getAllUser();

	/**
	 * 通过id删除用户
	 * @param id
	 * @return
	 */
	public boolean deleteUserById(int id);

	/**
	 * 删除选中的用户
	 * @param ids id数组
	 * @return
	 */
	public void deleteSelectedUser(int[] ids);

	/**
	 * 通过id修改用户
	 * @param id
	 * @return
	 */
	public void updateUserById(User user);

	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public void addUser(User user);
}
