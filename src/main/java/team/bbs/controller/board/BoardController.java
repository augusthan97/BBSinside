package team.bbs.controller.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import team.bbs.domain.dto.BoardDto;

import java.util.List;

@Controller
public class BoardController {


    @RequestMapping("/board")
    public String board() {
        //model board
        List<BoardDto> result = null;

        return "/board/board";
    }

    // 게시판 생성 건의
    @RequestMapping("/propose")
    public String propose() {
        return "/board/purpose";
    }

    /*
    * 게시판 삭제
    * 게시판 수정
    * 추천글
    * 공지
    *
    *
    * */


}
