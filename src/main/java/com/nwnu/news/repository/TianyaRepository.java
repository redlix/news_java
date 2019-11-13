package com.nwnu.news.repository;

import com.nwnu.news.entity.TianyaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * tianya repository
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/11/13     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/11/13 8:37 AM
 * @since 1.0.0
 */
@Repository
public interface TianyaRepository extends JpaRepository<TianyaEntity, String> {
}
