package com.shinchan.mybatis.Dao;

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
	public Boolean deleteUserById(int id);

	/**
	 * 删除选中的用户
	 * @param ids id数组
	 * @return
	 */
	public Boolean deleteSelectedUser(int[] ids);

	/**
	 * 通过id修改用户
	 * @param id
	 * @return
	 */
	public Boolean updateUserById(int id);

	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public Boolean addUser(User user);
}
