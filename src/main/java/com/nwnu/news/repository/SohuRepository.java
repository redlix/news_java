package com.nwnu.news.repository;

import com.nwnu.news.entity.SjSohuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

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
@Repository
public interface SohuRepository extends JpaRepository<SjSohuEntity, String> {
}
