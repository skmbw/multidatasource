package com.vteba.user.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vteba.user.dao.spi.UserDao;
import com.vteba.user.model.User;

/**
 * 用户dao实现
 * 
 * @author yinlei
 * @see
 * @since 2015年4月29日 下午3:10:25
 */
@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory ds1SessionFactory;
	
	public Long save(User user) {
		return (Long) ds1SessionFactory.getCurrentSession().save(user);
	}

}
