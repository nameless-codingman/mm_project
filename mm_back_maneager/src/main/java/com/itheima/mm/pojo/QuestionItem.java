package com.itheima.mm.pojo;



/**
 * @author ：yp
 * @description : 题目选项POJO类
 * 扩展字段为非数据库表对应字段，用于前端页面显示使用
 * @version: 1.0
 */

public class QuestionItem {

  private Integer id;
  private String content;
  private String imgUrl;
  private Integer isRight;
  private Integer questionId;
  // 扩展字段
  private String code;
  private String title;

  public QuestionItem() {
  }

  public QuestionItem(Integer id, String content, String imgUrl, Integer isRight, Integer questionId, String code, String title) {
    this.id = id;
    this.content = content;
    this.imgUrl = imgUrl;
    this.isRight = isRight;
    this.questionId = questionId;
    this.code = code;
    this.title = title;
  }

  /**
   * 页面返回时需要boolean类型
   * @return
   */
  public boolean getIsRight() {
    return isRight == 1;
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
   * @return content
   */
  public String getContent() {
    return content;
  }

  /**
   * 设置
   * @param content
   */
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * 获取
   * @return imgUrl
   */
  public String getImgUrl() {
    return imgUrl;
  }

  /**
   * 设置
   * @param imgUrl
   */
  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  /**
   * 设置
   * @param isRight
   */
  public void setIsRight(Integer isRight) {
    this.isRight = isRight;
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
   * @return code
   */
  public String getCode() {
    return code;
  }

  /**
   * 设置
   * @param code
   */
  public void setCode(String code) {
    this.code = code;
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
    return "QuestionItem{id = " + id + ", content = " + content + ", imgUrl = " + imgUrl + ", isRight = " + isRight + ", questionId = " + questionId + ", code = " + code + ", title = " + title + "}";
  }
}
