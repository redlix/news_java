package com.nwnu.news.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "sina")
public class SinaEntity implements Serializable {
	private static final long serialVersionUID = 2053488200339357296L;
	@Id
	private String id;
	private String number;
	private Integer time;
	private String url;
	private String userid;
	private String nickname;
	private String avatar;
	private Integer followCount;
	private Integer followersCount;
	private Integer postTime;
	private String postContent;
	private String postContentTxt;
	private String source;
	private Integer repostsCount;
	private Integer commentsCount;
	private Integer attitudesCount;
	private String isLongText;
	private String pics;
	private String video;
	private String videoPic;
	private String isRepost;
	private String origin;
	private String reposts;
	private String comments;
	private String topic;
	private Integer wordCount;
	private String pnWordCount;
	private Integer positiveNumber;
	private Integer negativeNumber;
}
