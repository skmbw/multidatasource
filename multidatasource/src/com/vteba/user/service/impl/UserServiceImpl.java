package com.vteba.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vteba.user.dao.spi.UserDao;
import com.vteba.user.model.User;
import com.vteba.user.service.spi.UserService;

/**
 * 用户service实现
 * 
 * @author yinlei
 * @see
 * @since 2015年4月29日 下午4:11:12
 */
@Service
@Transactional(value = "ds1TransactionManager")// 指定事务管理器
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDaoImpl;
	
	public Long save(User user) {
		return userDaoImpl.save(user);
	}
}
