package com.nwnu.news.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "sohu")
public class SohuEntity implements Serializable {

	private static final long serialVersionUID = -1284704998419716221L;
	@Id
	private String id;
	private String number;
	private Integer time;
	private String articleLink;
	private String articleTitle;
	private String articleContent;
	private String articleContentTxt;
	private String articleAuthor;
	private String articleAvatar;
	private Integer viewsCount;
	private Integer articlePublishTime;
	private String articleTopics;
	private String articleThumbnails;
	private String articleCategory;
	private Integer wordCount;
	private String pnWordCount;
	private Integer positiveNumber;
	private Integer negativeNumber;
	private String comment;
}
