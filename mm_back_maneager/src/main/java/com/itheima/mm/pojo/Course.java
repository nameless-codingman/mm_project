package com.itheima.mm.pojo;



import java.util.List;

/**
 * @author ：yp
 * @description : 学科POJO类
 * 扩展字段为非数据库表对应字段，用于前端页面显示使用
 * @version: 1.0
 */

public class Course {

  private Integer id;
  private String name;    // 学科名
  private String icon;    //
  private String createDate;
  private Integer isShow;     // 0 显示  1 不显示
  private Integer userId;
  private Integer orderNo;    // 显示顺序权重，提高该值的显示顺序
  //  学科下的目录列表
  private List<Catalog> catalogList;
  //  学科下的标签列表
  private List<Tag> tagList;

  // 扩展字段，用户前端页面显示
  private String creator; // 创建者
  private Integer catalogQty; // 学科目录数量
  private Integer tagQty;     // 学科标签数量
  private Integer questionQty; // 题目数量
  private String title;


  public Course() {
  }

  public Course(Integer id, String name, String icon, String createDate, Integer isShow, Integer userId, Integer orderNo, List<Catalog> catalogList, List<Tag> tagList, String creator, Integer catalogQty, Integer tagQty, Integer questionQty, String title) {
    this.id = id;
    this.name = name;
    this.icon = icon;
    this.createDate = createDate;
    this.isShow = isShow;
    this.userId = userId;
    this.orderNo = orderNo;
    this.catalogList = catalogList;
    this.tagList = tagList;
    this.creator = creator;
    this.catalogQty = catalogQty;
    this.tagQty = tagQty;
    this.questionQty = questionQty;
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
   * @return icon
   */
  public String getIcon() {
    return icon;
  }

  /**
   * 设置
   * @param icon
   */
  public void setIcon(String icon) {
    this.icon = icon;
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
   * @return isShow
   */
  public Integer getIsShow() {
    return isShow;
  }

  /**
   * 设置
   * @param isShow
   */
  public void setIsShow(Integer isShow) {
    this.isShow = isShow;
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
   * @return catalogList
   */
  public List<Catalog> getCatalogList() {
    return catalogList;
  }

  /**
   * 设置
   * @param catalogList
   */
  public void setCatalogList(List<Catalog> catalogList) {
    this.catalogList = catalogList;
  }

  /**
   * 获取
   * @return tagList
   */
  public List<Tag> getTagList() {
    return tagList;
  }

  /**
   * 设置
   * @param tagList
   */
  public void setTagList(List<Tag> tagList) {
    this.tagList = tagList;
  }

  /**
   * 获取
   * @return creator
   */
  public String getCreator() {
    return creator;
  }

  /**
   * 设置
   * @param creator
   */
  public void setCreator(String creator) {
    this.creator = creator;
  }

  /**
   * 获取
   * @return catalogQty
   */
  public Integer getCatalogQty() {
    return catalogQty;
  }

  /**
   * 设置
   * @param catalogQty
   */
  public void setCatalogQty(Integer catalogQty) {
    this.catalogQty = catalogQty;
  }

  /**
   * 获取
   * @return tagQty
   */
  public Integer getTagQty() {
    return tagQty;
  }

  /**
   * 设置
   * @param tagQty
   */
  public void setTagQty(Integer tagQty) {
    this.tagQty = tagQty;
  }

  /**
   * 获取
   * @return questionQty
   */
  public Integer getQuestionQty() {
    return questionQty;
  }

  /**
   * 设置
   * @param questionQty
   */
  public void setQuestionQty(Integer questionQty) {
    this.questionQty = questionQty;
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
    return "Course{id = " + id + ", name = " + name + ", icon = " + icon + ", createDate = " + createDate + ", isShow = " + isShow + ", userId = " + userId + ", orderNo = " + orderNo + ", catalogList = " + catalogList + ", tagList = " + tagList + ", creator = " + creator + ", catalogQty = " + catalogQty + ", tagQty = " + tagQty + ", questionQty = " + questionQty + ", title = " + title + "}";
  }
}
