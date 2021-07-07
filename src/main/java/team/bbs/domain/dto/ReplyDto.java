package team.bbs.domain.dto;

import lombok.Data;
import team.bbs.domain.entities.Member;
import team.bbs.domain.entities.Page;

@Data
public class ReplyDto {


    private String content; // 댓글 내용컨텐츠

    private Page page;

    private Member member;

}
