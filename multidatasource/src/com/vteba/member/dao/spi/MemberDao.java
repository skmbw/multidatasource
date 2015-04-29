package com.vteba.member.dao.spi;

import com.vteba.member.model.Member;

/**
 * 成员实体DAO
 * 
 * @author yinlei
 * @see
 * @since 2015年4月29日 下午3:01:42
 */
public interface MemberDao {
	public Long save(Member member);
}
