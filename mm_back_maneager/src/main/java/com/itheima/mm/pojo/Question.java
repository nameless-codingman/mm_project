package com.itheima.mm.pojo;



import java.util.List;

/**
 * @author ：yp
 * @description : 题目POJO类
 * 扩展字段为非数据库表对应字段，用于前端页面显示使用
 * @version: 1.0
 */

public class Question {
	  private Integer id;		//ID
	  private String number;  	//试题编号
	  private String subject;	//题干
	  private Integer type;		//题目类型： 1. 单选  2. 多选 5. 简答
	  private Integer difficulty;	//难度： 0 简单  1. 一般 2. 困难
	  private String analysis;		//答案解析
	  private String analysisVideo;//答案解析视频
	  private String remark;		//
	  private Integer isClassic;  //是否精选题目 0 不是, 1 是
	  private Integer status;		//题目状态（status）：  0 待发布（待审核、已拒绝）、1 已发布（已审核）、 2 已下架（已审核）
	  private Integer reviewStatus; //审核状态（review_status）：  0 待审核、1 已审核、2 已拒绝
	  private String createDate;    //创建时间
	  private Integer userId;		//用户ID
	  private Integer companyId;  //企业id
	  private Integer catalogId;   //标签ID
	  private Integer courseId;    // 学科ID

	  // 扩展字段
	  private String courseName;            // 学科名称
	  private String usedQty;               // 使用次数
	  private String creator;               // 录入人员

	  private ReviewLog reviewLog;        // 最后一条审核日志

	  private List<String> tagNameList;      // 所属标签名称列表
	  private List<Tag> tagList;            // 所属标签列表
	  private Company company;              // 所属公司
	  private Catalog catalog;              // 所属学科目录
	  private List<QuestionItem> questionItemList; // 题目选项集合

	  // 扩展字段(小程序)
	  private String title;   // 题目标题
	  private Integer grade;  // 难易度
	  private String content; // 内容
	  private String video;    // 视频
	  private String videoPoster; // 视频封面
	  private Integer isFamous;      // 是否名企
	  private Integer answerTag;	// 答案标记
	  private String  answerResult;  // 用户答案
	  private boolean answerIsRight; // 回答是否正确
	  private Integer isFinished;    // 是否完成
	  private Integer isFavorite;    // 是否收藏
	  private List<Tag> tags;              // 标签
	  private Integer memberId;		 // 会员Id
	  private List<QuestionItem> selection; // 选项

	public Question() {
	}

	public Question(Integer id, String number, String subject, Integer type, Integer difficulty, String analysis, String analysisVideo, String remark, Integer isClassic, Integer status, Integer reviewStatus, String createDate, Integer userId, Integer companyId, Integer catalogId, Integer courseId, String courseName, String usedQty, String creator, ReviewLog reviewLog, List<String> tagNameList, List<Tag> tagList, Company company, Catalog catalog, List<QuestionItem> questionItemList, String title, Integer grade, String content, String video, String videoPoster, Integer isFamous, Integer answerTag, String answerResult, boolean answerIsRight, Integer isFinished, Integer isFavorite, List<Tag> tags, Integer memberId, List<QuestionItem> selection) {
		this.id = id;
		this.number = number;
		this.subject = subject;
		this.type = type;
		this.difficulty = difficulty;
		this.analysis = analysis;
		this.analysisVideo = analysisVideo;
		this.remark = remark;
		this.isClassic = isClassic;
		this.status = status;
		this.reviewStatus = reviewStatus;
		this.createDate = createDate;
		this.userId = userId;
		this.companyId = companyId;
		this.catalogId = catalogId;
		this.courseId = courseId;
		this.courseName = courseName;
		this.usedQty = usedQty;
		this.creator = creator;
		this.reviewLog = reviewLog;
		this.tagNameList = tagNameList;
		this.tagList = tagList;
		this.company = company;
		this.catalog = catalog;
		this.questionItemList = questionItemList;
		this.title = title;
		this.grade = grade;
		this.content = content;
		this.video = video;
		this.videoPoster = videoPoster;
		this.isFamous = isFamous;
		this.answerTag = answerTag;
		this.answerResult = answerResult;
		this.answerIsRight = answerIsRight;
		this.isFinished = isFinished;
		this.isFavorite = isFavorite;
		this.tags = tags;
		this.memberId = memberId;
		this.selection = selection;
	}

	/**
	 * 为选项按字母编号
 	 * @return
	 */
	public List<QuestionItem> getSelection(){
		Character code = 'A';
		if(selection == null) return null;
		for (QuestionItem questionItem:selection){
		  questionItem.setCode(code.toString());
		  code++;
		}
		return selection;
	  }

	/**
	 * 页面需要boolean类型返回
	 * @return
	 */
	public boolean getIsFamous() {
		return isFamous !=null && isFamous==1;
	  }

	/**
	 * 页面需要boolean类型返回
	 * @return
	 */
	  public boolean getIsFinished() {
		return isFinished !=null && isFinished==1;
	  }
	 /**
	 * 页面需要boolean类型返回
	 * @return
	 */
	  public boolean getIsFavorite() {
		return isFavorite!=null && isFavorite==1;
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
	 * @return number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * 设置
	 * @param number
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * 获取
	 * @return subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * 设置
	 * @param subject
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * 获取
	 * @return type
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * 设置
	 * @param type
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * 获取
	 * @return difficulty
	 */
	public Integer getDifficulty() {
		return difficulty;
	}

	/**
	 * 设置
	 * @param difficulty
	 */
	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}

	/**
	 * 获取
	 * @return analysis
	 */
	public String getAnalysis() {
		return analysis;
	}

	/**
	 * 设置
	 * @param analysis
	 */
	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}

	/**
	 * 获取
	 * @return analysisVideo
	 */
	public String getAnalysisVideo() {
		return analysisVideo;
	}

	/**
	 * 设置
	 * @param analysisVideo
	 */
	public void setAnalysisVideo(String analysisVideo) {
		this.analysisVideo = analysisVideo;
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
	 * @return isClassic
	 */
	public Integer getIsClassic() {
		return isClassic;
	}

	/**
	 * 设置
	 * @param isClassic
	 */
	public void setIsClassic(Integer isClassic) {
		this.isClassic = isClassic;
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
	 * @return reviewStatus
	 */
	public Integer getReviewStatus() {
		return reviewStatus;
	}

	/**
	 * 设置
	 * @param reviewStatus
	 */
	public void setReviewStatus(Integer reviewStatus) {
		this.reviewStatus = reviewStatus;
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
	 * @return companyId
	 */
	public Integer getCompanyId() {
		return companyId;
	}

	/**
	 * 设置
	 * @param companyId
	 */
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	/**
	 * 获取
	 * @return catalogId
	 */
	public Integer getCatalogId() {
		return catalogId;
	}

	/**
	 * 设置
	 * @param catalogId
	 */
	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
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

	/**
	 * 获取
	 * @return usedQty
	 */
	public String getUsedQty() {
		return usedQty;
	}

	/**
	 * 设置
	 * @param usedQty
	 */
	public void setUsedQty(String usedQty) {
		this.usedQty = usedQty;
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
	 * @return reviewLog
	 */
	public ReviewLog getReviewLog() {
		return reviewLog;
	}

	/**
	 * 设置
	 * @param reviewLog
	 */
	public void setReviewLog(ReviewLog reviewLog) {
		this.reviewLog = reviewLog;
	}

	/**
	 * 获取
	 * @return tagNameList
	 */
	public List<String> getTagNameList() {
		return tagNameList;
	}

	/**
	 * 设置
	 * @param tagNameList
	 */
	public void setTagNameList(List<String> tagNameList) {
		this.tagNameList = tagNameList;
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
	 * @return company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * 设置
	 * @param company
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * 获取
	 * @return catalog
	 */
	public Catalog getCatalog() {
		return catalog;
	}

	/**
	 * 设置
	 * @param catalog
	 */
	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	/**
	 * 获取
	 * @return questionItemList
	 */
	public List<QuestionItem> getQuestionItemList() {
		return questionItemList;
	}

	/**
	 * 设置
	 * @param questionItemList
	 */
	public void setQuestionItemList(List<QuestionItem> questionItemList) {
		this.questionItemList = questionItemList;
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

	/**
	 * 获取
	 * @return grade
	 */
	public Integer getGrade() {
		return grade;
	}

	/**
	 * 设置
	 * @param grade
	 */
	public void setGrade(Integer grade) {
		this.grade = grade;
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
	 * @return video
	 */
	public String getVideo() {
		return video;
	}

	/**
	 * 设置
	 * @param video
	 */
	public void setVideo(String video) {
		this.video = video;
	}

	/**
	 * 获取
	 * @return videoPoster
	 */
	public String getVideoPoster() {
		return videoPoster;
	}

	/**
	 * 设置
	 * @param videoPoster
	 */
	public void setVideoPoster(String videoPoster) {
		this.videoPoster = videoPoster;
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
	 * @return answerTag
	 */
	public Integer getAnswerTag() {
		return answerTag;
	}

	/**
	 * 设置
	 * @param answerTag
	 */
	public void setAnswerTag(Integer answerTag) {
		this.answerTag = answerTag;
	}

	/**
	 * 获取
	 * @return answerResult
	 */
	public String getAnswerResult() {
		return answerResult;
	}

	/**
	 * 设置
	 * @param answerResult
	 */
	public void setAnswerResult(String answerResult) {
		this.answerResult = answerResult;
	}

	/**
	 * 获取
	 * @return answerIsRight
	 */
	public boolean isAnswerIsRight() {
		return answerIsRight;
	}

	/**
	 * 设置
	 * @param answerIsRight
	 */
	public void setAnswerIsRight(boolean answerIsRight) {
		this.answerIsRight = answerIsRight;
	}

	/**
	 * 设置
	 * @param isFinished
	 */
	public void setIsFinished(Integer isFinished) {
		this.isFinished = isFinished;
	}

	/**
	 * 设置
	 * @param isFavorite
	 */
	public void setIsFavorite(Integer isFavorite) {
		this.isFavorite = isFavorite;
	}

	/**
	 * 获取
	 * @return tags
	 */
	public List<Tag> getTags() {
		return tags;
	}

	/**
	 * 设置
	 * @param tags
	 */
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	/**
	 * 获取
	 * @return memberId
	 */
	public Integer getMemberId() {
		return memberId;
	}

	/**
	 * 设置
	 * @param memberId
	 */
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	/**
	 * 设置
	 * @param selection
	 */
	public void setSelection(List<QuestionItem> selection) {
		this.selection = selection;
	}

	public String toString() {
		return "Question{id = " + id + ", number = " + number + ", subject = " + subject + ", type = " + type + ", difficulty = " + difficulty + ", analysis = " + analysis + ", analysisVideo = " + analysisVideo + ", remark = " + remark + ", isClassic = " + isClassic + ", status = " + status + ", reviewStatus = " + reviewStatus + ", createDate = " + createDate + ", userId = " + userId + ", companyId = " + companyId + ", catalogId = " + catalogId + ", courseId = " + courseId + ", courseName = " + courseName + ", usedQty = " + usedQty + ", creator = " + creator + ", reviewLog = " + reviewLog + ", tagNameList = " + tagNameList + ", tagList = " + tagList + ", company = " + company + ", catalog = " + catalog + ", questionItemList = " + questionItemList + ", title = " + title + ", grade = " + grade + ", content = " + content + ", video = " + video + ", videoPoster = " + videoPoster + ", isFamous = " + isFamous + ", answerTag = " + answerTag + ", answerResult = " + answerResult + ", answerIsRight = " + answerIsRight + ", isFinished = " + isFinished + ", isFavorite = " + isFavorite + ", tags = " + tags + ", memberId = " + memberId + ", selection = " + selection + "}";
	}
}
