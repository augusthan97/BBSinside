package team.bbs.domain.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@SequenceGenerator(
        sequenceName = "pageSeq",
        name = "pageSeq"
)
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"title", "member"})
public class Page {

    @Id
    @GeneratedValue(generator = "pageSeq")
    @Column(name = "PageNum")
    private Long num;

    private String title;

    @Lob
    private String content;

    private int recommend;

    private int unRecommend;

    private int activation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MemberNum")
    private Member member;

    @OneToMany(mappedBy = "page", orphanRemoval = true)
    private List<Reply> replies;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BoardNum")
    private Board board;

    @OneToMany(mappedBy = "page", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Upload> uploads;

}
