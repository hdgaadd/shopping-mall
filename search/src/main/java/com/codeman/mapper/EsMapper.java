package com.codeman.mapper;

import com.codeman.entity.EsProduct;
import com.codeman.entity.LearnTeacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/06 21:15:56
*/
@Mapper
public interface EsMapper {
    List<LearnTeacher> selectAll();
}