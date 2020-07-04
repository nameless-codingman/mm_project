package com.itheima.mm.pojo;



/**
 * @author ：yp
 * @description : 题目审核POJO类
 * 扩展字段为非数据库表对应字段，用于前端页面显示使用
 * @version: 1.0
 */

public class ReviewLog {

  private Integer id;
  private String comments;
  private Integer status;
  private Integer questionId;
  private Integer userId;
  private String createDate;
  // 扩展字段
  private String reviewer;       // 审核人

  public ReviewLog() {
  }

  public ReviewLog(Integer id, String comments, Integer status, Integer questionId, Integer userId, String createDate, String reviewer) {
    this.id = id;
    this.comments = comments;
    this.status = status;
    this.questionId = questionId;
    this.userId = userId;
    this.createDate = createDate;
    this.reviewer = reviewer;
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
   * @return comments
   */
  public String getComments() {
    return comments;
  }

  /**
   * 设置
   * @param comments
   */
  public void setComments(String comments) {
    this.comments = comments;
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
   * @return questionId
   */
  public Integer getQuestionId() {
    return questionId;
  }

  /**
   * 设置
   * @param questionId
   */
  public void setQuestionId(Integer questionId) {
    this.questionId = questionId;
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
   * @return reviewer
   */
  public String getReviewer() {
    return reviewer;
  }

  /**
   * 设置
   * @param reviewer
   */
  public void setReviewer(String reviewer) {
    this.reviewer = reviewer;
  }

  public String toString() {
    return "ReviewLog{id = " + id + ", comments = " + comments + ", status = " + status + ", questionId = " + questionId + ", userId = " + userId + ", createDate = " + createDate + ", reviewer = " + reviewer + "}";
  }
}
