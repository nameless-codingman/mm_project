package com.itheima.mm.pojo;



/**
 * @author ：yp
 * @description : 学科目录POJO类
 * 扩展字段为非数据库表对应字段，用于前端页面显示使用
 * @version: 1.0
 */

public class Catalog {
  private Integer id;
  private String name;  // 学科目录名
  private String createDate;
  private Integer status;   // 0 启动 1 禁用
  private Integer userId;
  private Integer courseId;
  private Integer orderNo; // 显示顺序权重，提高该值的显示顺序
  // 扩展字段，用于前台显示
  private String creator; // 创建者
  private Integer questionQty;   // 面试题数量;
  private Course course;  // 所属学科
  private String courseName;  // 所属学科名称

  public Catalog() {
  }

  public Catalog(Integer id, String name, String createDate, Integer status, Integer userId, Integer courseId, Integer orderNo, String creator, Integer questionQty, Course course, String courseName) {
    this.id = id;
    this.name = name;
    this.createDate = createDate;
    this.status = status;
    this.userId = userId;
    this.courseId = courseId;
    this.orderNo = orderNo;
    this.creator = creator;
    this.questionQty = questionQty;
    this.course = course;
    this.courseName = courseName;
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
   * @return status
   */
  public Integer getStatus() {
    return status;
  }

  /**
   * 设置
   * @param status
   */
  public void setStatus(Integer status) {
    this.status = status;
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
   * @return course
   */
  public Course getCourse() {
    return course;
  }

  /**
   * 设置
   * @param course
   */
  public void setCourse(Course course) {
    this.course = course;
  }

  /**
   * 获取
   * @return courseName
   */
  public String getCourseName() {
    return courseName;
  }

  /**
   * 设置
   * @param courseName
   */
  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public String toString() {
    return "Catalog{id = " + id + ", name = " + name + ", createDate = " + createDate + ", status = " + status + ", userId = " + userId + ", courseId = " + courseId + ", orderNo = " + orderNo + ", creator = " + creator + ", questionQty = " + questionQty + ", course = " + course + ", courseName = " + courseName + "}";
  }
}
