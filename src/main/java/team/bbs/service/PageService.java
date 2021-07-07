package team.bbs.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team.bbs.domain.dto.PageDto;
import team.bbs.domain.entities.Page;
import team.bbs.repository.PageRepository;

@Service
@RequiredArgsConstructor
public class PageService {

    private final PageRepository pageRepository;

    @Transactional
    public void savePage(Page page) {
        pageRepository.save(page);
    }

}
