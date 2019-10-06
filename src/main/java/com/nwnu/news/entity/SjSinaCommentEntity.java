package com.nwnu.news.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
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
 * @version 1.0.0 2019/10/6 11:45 AM
 * @since 1.0.0
 */
@Entity
@Data
@Table(name = "sj_sina_comment")
public class SjSinaCommentEntity implements Serializable {
	private static final long serialVersionUID = 544502324408183638L;
	@Id
	private String id;
	private String article_id;
	private String comment_userid;
	private String comment_nickname;
	private String comment_content;
	private String comment_attitudes_count;
	private String comment_time;
	private String comment_source;
}
