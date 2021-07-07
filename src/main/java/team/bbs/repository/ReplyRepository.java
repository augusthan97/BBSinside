package team.bbs.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.bbs.domain.entities.Reply;

@Repository
public interface ReplyRepository extends JpaRepository<Reply,Long> {
}
