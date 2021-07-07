package team.bbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.bbs.domain.entities.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    public Member findByName(String name);
}
