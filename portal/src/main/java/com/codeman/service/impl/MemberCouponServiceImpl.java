package com.codeman.service.impl;

import com.codeman.domain.Cart;
import com.codeman.entity.CouponDetail;
import com.codeman.service.MemberCouponService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/11 10:49:17
*/
@Service
public class MemberCouponServiceImpl implements MemberCouponService {
    @Override
    public List<CouponDetail> listCart(List<Cart> carts, String tyep) {
        return null;
    }
}
