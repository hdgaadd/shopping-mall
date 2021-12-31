package com.codeman.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.codeman.domain.Resource;
import com.codeman.mapper.ResourceMapper;
import com.codeman.service.ResourceService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/26
*/
@Service
public class ResourceServiceImpl implements ResourceService {
    @javax.annotation.Resource
    private ResourceMapper resourceMapper;
    @Override
    public List<Resource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageNum, Integer pageSize) {
        QueryWrapper<Resource> resourceQueryWrapper = new QueryWrapper<>();
        resourceQueryWrapper.eq("category_id", categoryId).like("name", nameKeyword).like("url", urlKeyword);
        List<Resource> resources = resourceMapper.selectList(resourceQueryWrapper);
        return resources;
    }
}
