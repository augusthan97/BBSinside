package team.bbs;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import team.bbs.entities.Member;
import team.bbs.entities.Page;
import team.bbs.entities.Reply;
import team.bbs.repository.MemberRepository;
import team.bbs.repository.PageRepository;
import team.bbs.repository.ReplyRepository;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    PageRepository pageRepository;

    @Autowired
    ReplyRepository commentRepository;

    @Autowired
    EntityManager entityManager;

    List<Member> members = new ArrayList<>();
    List<Page> pages = new ArrayList<>();
    List<Reply> comments = new ArrayList<>();

    @BeforeEach
    public void set() {

//        for (int i = 0; i < 20; i++) {
//                Member member = new Member("id" + i, "pw" + i, "email" + i, null);
//                members.add(member);

                for (int j = 0; j < 5; j++) {
                    Page page = new Page();
                    page.setTitle("title" + j);
                    page.setContent("content" + j);
                    //page.setMember(member);
                    pages.add(page);

                    for (int k = 0; k < 3; k++) {
                        Reply comment = new Reply("comment" +j+"/"+ k, page, null);
                        comments.add(comment);
                    }
                }
           // }

    }

    @Test
    @Transactional
    public void 멤버_저장(){
        //when

        memberRepository.saveAll(members);
        pageRepository.saveAll(pages);
        commentRepository.saveAll(comments);

        entityManager.flush();
        entityManager.clear();

        pageRepository.deleteById(2L);

        List<Member> memberList = memberRepository.findAll();
        List<Page> pageList = pageRepository.findAll();
        List<Reply> commentList = commentRepository.findAll();
        //then


//        Assertions.assertIterableEquals(memberList, members);
//        Assertions.assertIterableEquals(pages, pageList);
//        Assertions.assertIterableEquals(commentList, comments);







    }
}
