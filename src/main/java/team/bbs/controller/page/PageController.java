package team.bbs.controller.page;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import team.bbs.domain.dto.BoardDto;
import team.bbs.domain.dto.PageDto;
import team.bbs.domain.entities.Member;
import team.bbs.domain.entities.Page;
import team.bbs.service.MemberService;
import team.bbs.service.PageService;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class PageController {

    private ModelMapper modelMapper = new ModelMapper();

    private final MemberService memberService;
    private final PageService pageService;

    @GetMapping("/page/{id}")
    public String page(@PathVariable("id") Long id) {
        return "/page/page";
    }

    @GetMapping("/write")
    public String writePage(@ModelAttribute("pageDto") PageDto pageDto) {
        return "/page/write";
    }

    @PostMapping("/write")
    public String write(@Valid PageDto pageDto) {
        Page page = modelMapper.map(pageDto, Page.class);
        page.setMember(memberService.findByName(SecurityContextHolder.getContext().getAuthentication().getName()));
        pageService.savePage(page);
        return "redirect:/";
    }

}
