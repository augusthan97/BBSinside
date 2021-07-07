package team.bbs.domain.dto;

import lombok.Data;
import team.bbs.domain.entities.Page;

@Data
public class UploadDto {

    private String filename; // 파일 이름

    private Page page;
}
