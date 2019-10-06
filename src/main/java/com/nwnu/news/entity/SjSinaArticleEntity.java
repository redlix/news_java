package com.nwnu.news.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * SinaEntity
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/10/04     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/10/4 10:58 AM
 * @since 1.0.0
 */
@Data
@Entity
@Table(name = "sj_sina_article")
public class SjSinaArticleEntity implements Serializable {
	private static final long serialVersionUID = -3013776712039356819L;
	@Id
	private String id;
	private String url;
	private Integer time;
	private String nickname;
	private Integer follow_count;
	private Integer post_time;
	private String post_content_txt;
	private Integer reposts_count;
	private Integer comments_count;
	private Integer attitudes_count;
	private String topic;
}
