package team.bbs.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import team.bbs.repository.MemberRepository;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

}
