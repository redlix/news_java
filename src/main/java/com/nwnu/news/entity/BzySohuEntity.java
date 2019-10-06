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
 * @version 1.0.0 2019/10/6 11:35 AM
 * @since 1.0.0
 */
@Entity
@Data
@Table(name = "bzy_sohu_article")
public class BzySohuEntity implements Serializable {
	private static final long serialVersionUID = -6368035391217274853L;
	private String id;
	private String title;
	private String time;
	private String content;
}
