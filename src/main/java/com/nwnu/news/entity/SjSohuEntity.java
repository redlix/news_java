package com.nwnu.news.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/10/06     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/10/6 11:30 AM
 * @since 1.0.0
 */
@Entity
@Data
@Table(name = "sj_sohu_no_html")
public class SjSohuEntity implements Serializable {
	private static final long serialVersionUID = 3013776712039356819L;
	private String id;
	private Integer time;
	private String article_link;
	private String article_title;
	private String article_content;
	private String article_author;
	private String article_avatar;
	private Integer views_count;
	private Integer article_publish_time;
	private String article_topics;
	private String article_thumbnails;
	private String article_category;

}
