package cn.whiteleaf03.blog.repository;

import cn.whiteleaf03.blog.entity.SaySay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaySayRepository extends JpaRepository<SaySay, Long> {
}
