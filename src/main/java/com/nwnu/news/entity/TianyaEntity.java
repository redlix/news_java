package com.nwnu.news.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "tianya")
public class TianyaEntity implements Serializable {

  private static final long serialVersionUID = 3983810619975410701L;
  @Id
  private String id;
  private String number;
  private String questionLink;
  private String questionTitle;
  private Integer getTime;
  private String questionDetail;
  private String questionAuthor;
  private String questionAuthorAvatar;
  private String questionPublishTime;
  private String questionTopics;
  private String questionAnswer;
  private Integer wordCount;
  private String pnWordCount;
  private Integer positiveNumber;
  private Integer negativeNumber;
}
