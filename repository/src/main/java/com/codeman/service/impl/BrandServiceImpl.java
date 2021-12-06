package com.codeman.service.impl;

import com.codeman.domain.Brand;
import com.codeman.mapper.BrandMapper;
import com.codeman.service.IBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hdgaadd
 * @since 2021-12-06
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
