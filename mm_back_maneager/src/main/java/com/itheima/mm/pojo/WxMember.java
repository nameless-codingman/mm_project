package com.itheima.mm.pojo;



/**
 * @author ：yp
 * @description : 成员POJO类
 * @version: 1.0
 */

public class WxMember {

  private int id;
  private String nickName;
  private String avatarUrl;
  private String gender;
  private String city;
  private String province;
  private String country;
  private String language;
  private String openId;
  private String unionId;
  private String createTime;
  private Integer courseId;
  private Integer cityId;
  private Integer lastCategoryKind; // 最后做题分类种类 按技术（学科目录）-1、按企业-2、按方向-3
  private Integer lastCategoryType; // 最后做题分类类型  101-刷题,、201-错题本、202-我的练习、203-收藏题目
  private Integer lastCategoryId;   // 最后做题分类种类列表项Id  种类为1，代表学科目录ID，种类2，代表企业ID，种类3，代表行业方向Id
  private Integer lastQuestionId;   // 最后题目Id

  public WxMember() {
  }

  public WxMember(int id, String nickName, String avatarUrl, String gender, String city, String province, String country, String language, String openId, String unionId, String createTime, Integer courseId, Integer cityId, Integer lastCategoryKind, Integer lastCategoryType, Integer lastCategoryId, Integer lastQuestionId) {
    this.id = id;
    this.nickName = nickName;
    this.avatarUrl = avatarUrl;
    this.gender = gender;
    this.city = city;
    this.province = province;
    this.country = country;
    this.language = language;
    this.openId = openId;
    this.unionId = unionId;
    this.createTime = createTime;
    this.courseId = courseId;
    this.cityId = cityId;
    this.lastCategoryKind = lastCategoryKind;
    this.lastCategoryType = lastCategoryType;
    this.lastCategoryId = lastCategoryId;
    this.lastQuestionId = lastQuestionId;
  }

  /**
   * 获取
   * @return id
   */
  public int getId() {
    return id;
  }

  /**
   * 设置
   * @param id
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * 获取
   * @return nickName
   */
  public String getNickName() {
    return nickName;
  }

  /**
   * 设置
   * @param nickName
   */
  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  /**
   * 获取
   * @return avatarUrl
   */
  public String getAvatarUrl() {
    return avatarUrl;
  }

  /**
   * 设置
   * @param avatarUrl
   */
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   * 获取
   * @return gender
   */
  public String getGender() {
    return gender;
  }

  /**
   * 设置
   * @param gender
   */
  public void setGender(String gender) {
    this.gender = gender;
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
   * @return province
   */
  public String getProvince() {
    return province;
  }

  /**
   * 设置
   * @param province
   */
  public void setProvince(String province) {
    this.province = province;
  }

  /**
   * 获取
   * @return country
   */
  public String getCountry() {
    return country;
  }

  /**
   * 设置
   * @param country
   */
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * 获取
   * @return language
   */
  public String getLanguage() {
    return language;
  }

  /**
   * 设置
   * @param language
   */
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * 获取
   * @return openId
   */
  public String getOpenId() {
    return openId;
  }

  /**
   * 设置
   * @param openId
   */
  public void setOpenId(String openId) {
    this.openId = openId;
  }

  /**
   * 获取
   * @return unionId
   */
  public String getUnionId() {
    return unionId;
  }

  /**
   * 设置
   * @param unionId
   */
  public void setUnionId(String unionId) {
    this.unionId = unionId;
  }

  /**
   * 获取
   * @return createTime
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * 设置
   * @param createTime
   */
  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  /**
   * 获取
   * @return courseId
   */
  public Integer getCourseId() {
    return courseId;
  }

  /**
   * 设置
   * @param courseId
   */
  public void setCourseId(Integer courseId) {
    this.courseId = courseId;
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
   * @return lastCategoryKind
   */
  public Integer getLastCategoryKind() {
    return lastCategoryKind;
  }

  /**
   * 设置
   * @param lastCategoryKind
   */
  public void setLastCategoryKind(Integer lastCategoryKind) {
    this.lastCategoryKind = lastCategoryKind;
  }

  /**
   * 获取
   * @return lastCategoryType
   */
  public Integer getLastCategoryType() {
    return lastCategoryType;
  }

  /**
   * 设置
   * @param lastCategoryType
   */
  public void setLastCategoryType(Integer lastCategoryType) {
    this.lastCategoryType = lastCategoryType;
  }

  /**
   * 获取
   * @return lastCategoryId
   */
  public Integer getLastCategoryId() {
    return lastCategoryId;
  }

  /**
   * 设置
   * @param lastCategoryId
   */
  public void setLastCategoryId(Integer lastCategoryId) {
    this.lastCategoryId = lastCategoryId;
  }

  /**
   * 获取
   * @return lastQuestionId
   */
  public Integer getLastQuestionId() {
    return lastQuestionId;
  }

  /**
   * 设置
   * @param lastQuestionId
   */
  public void setLastQuestionId(Integer lastQuestionId) {
    this.lastQuestionId = lastQuestionId;
  }

  public String toString() {
    return "WxMember{id = " + id + ", nickName = " + nickName + ", avatarUrl = " + avatarUrl + ", gender = " + gender + ", city = " + city + ", province = " + province + ", country = " + country + ", language = " + language + ", openId = " + openId + ", unionId = " + unionId + ", createTime = " + createTime + ", courseId = " + courseId + ", cityId = " + cityId + ", lastCategoryKind = " + lastCategoryKind + ", lastCategoryType = " + lastCategoryType + ", lastCategoryId = " + lastCategoryId + ", lastQuestionId = " + lastQuestionId + "}";
  }
}
