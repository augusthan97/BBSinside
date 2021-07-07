package team.bbs.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team.bbs.domain.entities.Member;
import team.bbs.domain.entities.Page;
import team.bbs.repository.MemberRepository;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public Member findByName(String name) {
        return memberRepository.findByName(name);
    }

}
