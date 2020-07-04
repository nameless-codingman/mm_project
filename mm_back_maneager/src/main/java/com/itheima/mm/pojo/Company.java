package com.itheima.mm.pojo;



import java.util.List;

/**
 * @author ：yp
 * @description : 公司POJO类
 * 扩展字段为非数据库表对应字段，用于前端页面显示使用
 * @version: 1.0
 */
public class Company {
  private Integer id;
  private String shortName;   // 公司简称
  private String fullName;    // 公司全称
  private Integer isFamous;   // 是否名企
  private Integer state;
  private String remark;
  private String createDate;
  private Integer cityId;
  private Integer userId;
  private Integer orderNo; // 显示顺序权重，提高该值的显示顺序

  private List<Industry> industryList;
  // 扩展字段
  private  String city; // 城市名称
  private List<String> industryNameList; // 所属行业名称列表

  public Company() {
  }

  public Company(Integer id, String shortName, String fullName, Integer isFamous, Integer state, String remark, String createDate, Integer cityId, Integer userId, Integer orderNo, List<Industry> industryList, String city, List<String> industryNameList) {
    this.id = id;
    this.shortName = shortName;
    this.fullName = fullName;
    this.isFamous = isFamous;
    this.state = state;
    this.remark = remark;
    this.createDate = createDate;
    this.cityId = cityId;
    this.userId = userId;
    this.orderNo = orderNo;
    this.industryList = industryList;
    this.city = city;
    this.industryNameList = industryNameList;
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
   * @return shortName
   */
  public String getShortName() {
    return shortName;
  }

  /**
   * 设置
   * @param shortName
   */
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  /**
   * 获取
   * @return fullName
   */
  public String getFullName() {
    return fullName;
  }

  /**
   * 设置
   * @param fullName
   */
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   * 获取
   * @return isFamous
   */
  public Integer getIsFamous() {
    return isFamous;
  }

  /**
   * 设置
   * @param isFamous
   */
  public void setIsFamous(Integer isFamous) {
    this.isFamous = isFamous;
  }

  /**
   * 获取
   * @return state
   */
  public Integer getState() {
    return state;
  }

  /**
   * 设置
   * @param state
   */
  public void setState(Integer state) {
    this.state = state;
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
   * @return createDate
   */
  public String getCreateDate() {
    return createDate;
  }

  /**
   * 设置
   * @param createDate
   */
  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  /**
   * 获取
   * @return cityId
   */
  public Integer getCityId() {
    return cityId;
  }

  /**
   * 设置
   * @param cityId
   */
  public void setCityId(Integer cityId) {
    this.cityId = cityId;
  }

  /**
   * 获取
   * @return userId
   */
  public Integer getUserId() {
    return userId;
  }

  /**
   * 设置
   * @param userId
   */
  public void setUserId(Integer userId) {
    this.userId = userId;
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
   * @return industryList
   */
  public List<Industry> getIndustryList() {
    return industryList;
  }

  /**
   * 设置
   * @param industryList
   */
  public void setIndustryList(List<Industry> industryList) {
    this.industryList = industryList;
  }

  /**
   * 获取
   * @return city
   */
  public String getCity() {
    return city;
  }

  /**
   * 设置
   * @param city
   */
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * 获取
   * @return industryNameList
   */
  public List<String> getIndustryNameList() {
    return industryNameList;
  }

  /**
   * 设置
   * @param industryNameList
   */
  public void setIndustryNameList(List<String> industryNameList) {
    this.industryNameList = industryNameList;
  }

  public String toString() {
    return "Company{id = " + id + ", shortName = " + shortName + ", fullName = " + fullName + ", isFamous = " + isFamous + ", state = " + state + ", remark = " + remark + ", createDate = " + createDate + ", cityId = " + cityId + ", userId = " + userId + ", orderNo = " + orderNo + ", industryList = " + industryList + ", city = " + city + ", industryNameList = " + industryNameList + "}";
  }
}
