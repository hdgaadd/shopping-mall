package com.codeman.dao;

import com.codeman.domain.CouponDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/11 10:49:17
*/
@Mapper
public interface MemberCouponDao {
    List<CouponDetail> getAllCoupon(@Param("id") Long id);
}