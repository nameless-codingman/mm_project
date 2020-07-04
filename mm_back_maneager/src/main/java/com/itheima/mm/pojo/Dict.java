package com.itheima.mm.pojo;



import java.util.List;

/**
 * @author ：yp
 * @description : 数据字典POJO类
 * 扩展字段为非数据库表对应字段，用于前端页面显示使用
 * @version: 1.0
 */

public class Dict {
  private Integer id;
  private Integer pid;
  private Integer dataType;   // 数据类型，0-表示省 1-表示城市
  private String dataCode;    // 数据编码，
  private String dataValue;   // 数据值
  private Integer dataTag;    // 数据标记，比如省市列表中，0 表示不首页显示 1首页显示，根据业务定义
  private String dataDesc;
  private Integer orderNo;    // 显示顺序权重，提高该值的显示顺序

  // 二级数据
  private List<Dict> subList;
  // 扩展字段
  private String title;

  public Dict() {
  }

  public Dict(Integer id, Integer pid, Integer dataType, String dataCode, String dataValue, Integer dataTag, String dataDesc, Integer orderNo, List<Dict> subList, String title) {
    this.id = id;
    this.pid = pid;
    this.dataType = dataType;
    this.dataCode = dataCode;
    this.dataValue = dataValue;
    this.dataTag = dataTag;
    this.dataDesc = dataDesc;
    this.orderNo = orderNo;
    this.subList = subList;
    this.title = title;
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
   * @return pid
   */
  public Integer getPid() {
    return pid;
  }

  /**
   * 设置
   * @param pid
   */
  public void setPid(Integer pid) {
    this.pid = pid;
  }

  /**
   * 获取
   * @return dataType
   */
  public Integer getDataType() {
    return dataType;
  }

  /**
   * 设置
   * @param dataType
   */
  public void setDataType(Integer dataType) {
    this.dataType = dataType;
  }

  /**
   * 获取
   * @return dataCode
   */
  public String getDataCode() {
    return dataCode;
  }

  /**
   * 设置
   * @param dataCode
   */
  public void setDataCode(String dataCode) {
    this.dataCode = dataCode;
  }

  /**
   * 获取
   * @return dataValue
   */
  public String getDataValue() {
    return dataValue;
  }

  /**
   * 设置
   * @param dataValue
   */
  public void setDataValue(String dataValue) {
    this.dataValue = dataValue;
  }

  /**
   * 获取
   * @return dataTag
   */
  public Integer getDataTag() {
    return dataTag;
  }

  /**
   * 设置
   * @param dataTag
   */
  public void setDataTag(Integer dataTag) {
    this.dataTag = dataTag;
  }

  /**
   * 获取
   * @return dataDesc
   */
  public String getDataDesc() {
    return dataDesc;
  }

  /**
   * 设置
   * @param dataDesc
   */
  public void setDataDesc(String dataDesc) {
    this.dataDesc = dataDesc;
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

  /**
   * 获取
   * @return subList
   */
  public List<Dict> getSubList() {
    return subList;
  }

  /**
   * 设置
   * @param subList
   */
  public void setSubList(List<Dict> subList) {
    this.subList = subList;
  }

  /**
   * 获取
   * @return title
   */
  public String getTitle() {
    return title;
  }

  /**
   * 设置
   * @param title
   */
  public void setTitle(String title) {
    this.title = title;
  }

  public String toString() {
    return "Dict{id = " + id + ", pid = " + pid + ", dataType = " + dataType + ", dataCode = " + dataCode + ", dataValue = " + dataValue + ", dataTag = " + dataTag + ", dataDesc = " + dataDesc + ", orderNo = " + orderNo + ", subList = " + subList + ", title = " + title + "}";
  }
}
