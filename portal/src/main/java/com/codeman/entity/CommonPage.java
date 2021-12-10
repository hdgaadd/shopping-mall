package com.codeman.entity;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/07/21:34
 */
public class CommonPage<T> {

    private Integer pageNum;

    private Integer pageSize; // 每页数量

    private Long totalCount;

    private Integer totalPage;

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    private List<T> result;

    public static <T>CommonPage<T> restPage(List<T> brands) {
        CommonPage<T> brandCommonPage = new CommonPage<>();
        PageInfo<T> tPageInfo = new PageInfo<T>(brands);
        brandCommonPage.setPageNum(tPageInfo.getPageNum());
        brandCommonPage.setPageSize(tPageInfo.getPageSize());
        brandCommonPage.setResult(tPageInfo.getList());
        brandCommonPage.setTotalCount(tPageInfo.getTotal());
        brandCommonPage.setTotalPage(tPageInfo.getPageSize());
        return brandCommonPage;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

}
