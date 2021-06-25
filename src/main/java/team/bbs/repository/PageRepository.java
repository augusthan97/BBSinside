package team.bbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.bbs.entities.Page;

@Repository
public interface PageRepository extends JpaRepository<Page, Long> {
}
