package com.nwnu.news.entity;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/10/06     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/10/6 11:40 AM
 * @since 1.0.0
 */

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "sj_tianya_article")
public class SjTianyaArticleEntity implements Serializable {
	private static final long serialVersionUID = 1741969539968073892L;
	private String id;
	private String question_title;
	private Integer get_time;
	private String question_detail;
	private String question_author;
	private Integer question_publish_time;
	private String question_topics;
	private String question_link;
}
