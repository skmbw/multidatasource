package com.vteba.member.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vteba.member.dao.spi.MemberDao;
import com.vteba.member.model.Member;

/**
 * 成员dao实现
 * 
 * @author yinlei
 * @see
 * @since 2015年4月29日 下午3:02:02
 */
@Repository
public class MemberDaoImpl implements MemberDao {
	
	@Autowired
	private SessionFactory ds2SessionFactory;

	@Override
	public Long save(Member member) {
		return (Long) ds2SessionFactory.getCurrentSession().save(member);
	}

}
