package team.bbs.domain.dto;

import lombok.Data;
import team.bbs.domain.entities.Board;
import team.bbs.domain.entities.Member;
import team.bbs.domain.entities.Reply;
import team.bbs.domain.entities.Upload;

import javax.persistence.*;
import java.util.List;

@Data
public class PageDto {


    private String title; //제목

    private String content; //내용

    private int recommend; //추천

    private int unRecommend; //비추

    private int activation; //활성상태?

    private Member member; //회원번호

    private List<Reply> replies;

    private Board board;

    private List<Upload> uploads; //파일

}
