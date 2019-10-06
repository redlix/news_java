package com.nwnu.news.repository;

import com.nwnu.news.entity.SjSinaArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/10/04     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/10/4 11:36 AM
 * @since 1.0.0
 */
@Repository
public interface SinaRepository extends JpaRepository<SjSinaArticleEntity, String> {

}
