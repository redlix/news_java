package com.nwnu.news.service;

import com.nwnu.news.entity.SinaEntity;
import org.springframework.data.domain.Page;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/10/04     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/10/4 11:41 AM
 * @since 1.0.0
 */
public interface SinaService {
	/**
	 * @param pageNum 页数
	 * @param pageSize 每页数量
	 * @return 结果
	 */
	Page findAll(int pageNum, int pageSize);

	SinaEntity findById(String id);
}
