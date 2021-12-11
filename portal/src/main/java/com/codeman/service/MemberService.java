package com.codeman.service;

import com.codeman.domain.Member;

/**
 * @author hdgaadd
 * Created on 2021/12/11 11:10:23
 */
public interface MemberService {
    /**
     * 获取当前登录会员
     */
    Member getCurrentMember();
}