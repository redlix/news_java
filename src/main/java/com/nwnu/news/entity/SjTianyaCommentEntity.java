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
 * @version 1.0.0 2019/10/6 11:42 AM
 * @since 1.0.0
 */
@Entity
@Data
@Table(name = "sj_tianya_comment")
public class SjTianyaCommentEntity implements Serializable {
	private static final long serialVersionUID = -493047420710795832L;
	private String id;
	private String article_id;
	private String question_answer_content;
	private String question_answer_author;
	private String question_answer_agree_count;
	private String question_answer_publish_time;
}
