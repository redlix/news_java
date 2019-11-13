package com.nwnu.news.service.impl;

import com.nwnu.news.entity.SinaEntity;
import com.nwnu.news.repository.SinaRepository;
import com.nwnu.news.service.SinaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
@Service
public class SinaServiceImpl implements SinaService {
	private final SinaRepository sinaRepository;

	public SinaServiceImpl(SinaRepository sinaRepository) {
		this.sinaRepository = sinaRepository;
	}

	@Override
	public Page findAll(int pageNum, int pageSize) {
		Sort sort = new Sort(
//				sortOrder.equals("asc") ? Sort.Direction.ASC :
				Sort.Direction.DESC, "id");
		Pageable pageable = PageRequest.of(pageNum - 1, pageSize, sort);
		return sinaRepository.findAll(pageable);
	}

	@Override
	public SinaEntity findById(String id) {
		Optional<SinaEntity> optional = sinaRepository.findById(id);
		return optional.orElse(null);
	}
}
