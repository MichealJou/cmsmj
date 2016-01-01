package com.mj.modules.cms.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 文章列表
 * 
 * @author zhouping
 *
 */
@Entity
@Table(name = "t_article")
public class ArticleEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3054517635661403074L;

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "art_id", length = 10)
	private Integer artId;

	/**
	 * 文章标题
	 */
	@Column(name = "art_title", length = 20, nullable = false)
	private String artTitle;

	/**
	 * 文章内容
	 */
	@Column(name = "art_content", columnDefinition = "text", nullable = false)
	private String artContent;

	/**
	 * 文章状态
	 */
	@Column(name = "art_status", length = 1, columnDefinition = "int default 0", nullable = false)
	private String artStatus;

	/**
	 * 文章创建时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "art_create_time", nullable = false)
	private Date artCreateTime;

	/**
	 * 文章类型
	 */
	@Column(name = "art_type", length = 1, nullable = false, columnDefinition = "int default 0")
	private String artType;

	/**
	 * 公司id
	 */
	@Column(name = "com_id", length = 10, nullable = false)
	private String comId;

	public ArticleEntity() {
		super();
	}

	public ArticleEntity(Integer artId, String artTitle, String artContent, String artStatus, Date artCreateTime,
			String artType, String comId) {
		super();
		this.artId = artId;
		this.artTitle = artTitle;
		this.artContent = artContent;
		this.artStatus = artStatus;
		this.artCreateTime = artCreateTime;
		this.artType = artType;
		this.comId = comId;
	}

	public Integer getArtId() {
		return artId;
	}

	public void setArtId(Integer artId) {
		this.artId = artId;
	}

	public String getArtTitle() {
		return artTitle;
	}

	public void setArtTitle(String artTitle) {
		this.artTitle = artTitle;
	}

	public String getArtContent() {
		return artContent;
	}

	public void setArtContent(String artContent) {
		this.artContent = artContent;
	}

	public String getArtStatus() {
		return artStatus;
	}

	public void setArtStatus(String artStatus) {
		this.artStatus = artStatus;
	}

	public Date getArtCreateTime() {
		return artCreateTime;
	}

	public void setArtCreateTime(Date artCreateTime) {
		this.artCreateTime = artCreateTime;
	}

	public String getArtType() {
		return artType;
	}

	public void setArtType(String artType) {
		this.artType = artType;
	}

	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
