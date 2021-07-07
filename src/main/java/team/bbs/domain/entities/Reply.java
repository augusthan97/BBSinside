package team.bbs.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@SequenceGenerator(
        sequenceName = "comSeq",
        name = "comSeq"
)
@NoArgsConstructor
@AllArgsConstructor
@Getter

public class Reply {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "comSeq")
    @Column(name = "CommentNum")
    private Long num; // PK

    @Column(name = "CommentContent")
    private String content; // 댓글 내용컨텐츠

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PageNum")
    private Page page;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="memberNum")
    private Member member;

    public Reply(String content, Page page, Member member) {
        this.content = content;
        this.page = page;
        this.member = member;
    }
}
