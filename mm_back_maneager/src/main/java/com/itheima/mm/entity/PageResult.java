package com.itheima.mm.entity;



import java.io.Serializable;
import java.util.List;

/**
 * @author ：yp
 * @description : 封装分页返回结果
 * @version: 1.0
 */
public class PageResult implements Serializable{
    private Long total;//总记录数
    private List rows;//当前页结果


    public PageResult() {
    }

    public PageResult(Long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    /**
     * 获取
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    /**
     * 设置
     * @param total
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * 获取
     * @return rows
     */
    public List getRows() {
        return rows;
    }

    /**
     * 设置
     * @param rows
     */
    public void setRows(List rows) {
        this.rows = rows;
    }

    public String toString() {
        return "PageResult{total = " + total + ", rows = " + rows + "}";
    }
}
