package com.codeman.service.impl;

import com.codeman.domain.Member;
import com.codeman.service.MemberService;
import org.springframework.stereotype.Service;

/**
 * @author hdgaadd
 * Created on 2021/12/11 11:10:23
*/
@Service
public class MemberServiceImpl implements MemberService {
    @Override
    public Member getCurrentMember() {
        // 暂定返回虚拟用户
        Member member = new Member();
        member.setId(1L);
        return member;
    }
}
