package com.vteba.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vteba.member.dao.spi.MemberDao;
import com.vteba.member.model.Member;
import com.vteba.member.service.spi.MemberService;

/**
 * 成员service实现
 * 
 * @author yinlei
 * @see
 * @since 2015年4月29日 下午4:07:45
 */
@Service
@Transactional(value = "ds2TransactionManager")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao memberDaoImpl;

	@Override
	public Long save(Member member) {
		return memberDaoImpl.save(member);
	}
	

}
