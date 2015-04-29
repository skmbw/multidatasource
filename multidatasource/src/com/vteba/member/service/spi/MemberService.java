package com.vteba.member.service.spi;

import com.vteba.member.model.Member;

/**
 * 成员service接口
 * 
 * @author yinlei
 * @see
 * @since 2015年4月29日 下午4:09:31
 */
public interface MemberService {
	public Long save(Member user);
}
