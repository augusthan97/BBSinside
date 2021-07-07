package team.bbs.domain.dto;

import lombok.Data;
import team.bbs.domain.entities.Page;
import team.bbs.domain.entities.Reply;

import javax.persistence.*;
import java.util.List;

@Data
public class MemberDto {


    private String id; // 계정 ID

    private String pw; // 계정 PW

    private String name; //이름

    private String email; // 계정 이메일

    private String  authority; // 계정 권한

    private List<Page> pages;

    private List<Reply> replies;
}
