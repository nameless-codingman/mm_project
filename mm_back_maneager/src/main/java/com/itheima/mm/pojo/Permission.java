package com.itheima.mm.pojo;



/**
 * @author ：yp
 * @description : 权限POJO类
 * @version: 1.0
 */

public class Permission {
  private Integer id;
  private String name;
  private String keyword;
  private String description;

  public Permission() {
  }

  public Permission(Integer id, String name, String keyword, String description) {
    this.id = id;
    this.name = name;
    this.keyword = keyword;
    this.description = description;
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
   * @return keyword
   */
  public String getKeyword() {
    return keyword;
  }

  /**
   * 设置
   * @param keyword
   */
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  /**
   * 获取
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * 设置
   * @param description
   */
  public void setDescription(String description) {
    this.description = description;
  }

  public String toString() {
    return "Permission{id = " + id + ", name = " + name + ", keyword = " + keyword + ", description = " + description + "}";
  }
}
