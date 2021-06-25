package team.bbs.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@SequenceGenerator(
        sequenceName = "uploadSeq",
        name = "uploadSeq"
)
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Upload{

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "uploadSeq")
    @Column(name = "UploadNum")
    private Long num; // PK

    @Column(name = "FileName")
    private String filename; // 파일 이름

    @ManyToOne(targetEntity = Member.class, fetch=FetchType.LAZY)
    @JoinColumn(name="viewNum")
    private Page page;

}
