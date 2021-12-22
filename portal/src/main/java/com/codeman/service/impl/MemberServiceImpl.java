package com.codeman.service.impl;

import com.codeman.domain.Member;
import com.codeman.mapper.MemberMapper;
import com.codeman.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hdgaadd
 * Created on 2021/12/11 11:10:23
*/
@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    private MemberMapper memberMapper;

    @Override
    public Member getCurrentMember() {
        // 暂定返回虚拟用户
        Member member = memberMapper.selectById(1L);
        return member;
    }
}
