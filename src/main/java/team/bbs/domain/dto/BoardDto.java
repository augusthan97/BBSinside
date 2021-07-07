package team.bbs.domain.dto;

import lombok.Data;
import team.bbs.domain.entities.Page;

import java.util.List;


@Data
public class BoardDto {

    private String name; // 게시판 이름

    private String describe; // 게시판 설명

    private List<Page> pages; // 페이지
}
