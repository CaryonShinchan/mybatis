package com.shinchan.mybatis.utils;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MBSF {

	public static SqlSessionFactory sqlMapper;

	static {
		try {
			String resource = "mybatis-config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			System.err.println("MBSF.enclosing_method() : " + "Mybytis 初始化失败");
			e.printStackTrace();
		}
	}

	public static SqlSession getSqlSession() {
		return sqlMapper.openSession();
	}
}
