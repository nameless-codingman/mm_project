package com.itheima.mm.pojo;



/**
 * @author ：yp
 * @description : 行业方向POJO类
 * @version: 1.0
 */

public class Industry {

  private Integer id;
  private String name;
  private String remark;
  private Integer orderNo;

  public Industry() {
  }

  public Industry(Integer id, String name, String remark, Integer orderNo) {
    this.id = id;
    this.name = name;
    this.remark = remark;
    this.orderNo = orderNo;
  }

  /**
   * 获取
   * @return id
   */
  public Integer getId() {
    return id;
  }

  /**
   * 设置
   * @param id
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 获取
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * 设置
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * 获取
   * @return remark
   */
  public String getRemark() {
    return remark;
  }

  /**
   * 设置
   * @param remark
   */
  public void setRemark(String remark) {
    this.remark = remark;
  }

  /**
   * 获取
   * @return orderNo
   */
  public Integer getOrderNo() {
    return orderNo;
  }

  /**
   * 设置
   * @param orderNo
   */
  public void setOrderNo(Integer orderNo) {
    this.orderNo = orderNo;
  }

  public String toString() {
    return "Industry{id = " + id + ", name = " + name + ", remark = " + remark + ", orderNo = " + orderNo + "}";
  }
}
