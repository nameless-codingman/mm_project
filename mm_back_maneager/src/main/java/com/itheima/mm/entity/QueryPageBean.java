package com.itheima.mm.entity;


import java.io.Serializable;
import java.util.Map;

/**
 * @author ：yp
 * @description : 封装查询条件
 * @version: 1.0
 */

public class QueryPageBean implements Serializable{
    private Integer currentPage; // 页码
    private Integer pageSize;   //每页记录数
    private Map queryParams;    //查询条件
    private Integer offset; // 分页查询，开始记录下标

    public QueryPageBean() {
    }

    public QueryPageBean(Integer currentPage, Integer pageSize, Map queryParams, Integer offset) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.queryParams = queryParams;
        this.offset = offset;
    }

    /**
     * 获取分页起始记录位置
     * 根据分页页数，计算limit其实记录
     * @return
     */


    public Integer getOffset(){
        return (currentPage-1)*pageSize;
    }

    /**
     * 获取
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    /**
     * 设置
     * @param currentPage
     */
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * 获取
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获取
     * @return queryParams
     */
    public Map getQueryParams() {
        return queryParams;
    }

    /**
     * 设置
     * @param queryParams
     */
    public void setQueryParams(Map queryParams) {
        this.queryParams = queryParams;
    }

    /**
     * 设置
     * @param offset
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String toString() {
        return "QueryPageBean{currentPage = " + currentPage + ", pageSize = " + pageSize + ", queryParams = " + queryParams + ", offset = " + offset + "}";
    }
}