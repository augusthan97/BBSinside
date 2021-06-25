package team.bbs.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@SequenceGenerator(
        sequenceName = "boardSeq",
        name = "boardSeq"
)
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Board{

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "boardSeq")
    @Column(name = "BoardNum")
    private Long num; // PK

    @Column(name = "BoardName")
    private String name; // 게시판 이름

    @Column(name = "BoardDescribe")
    private String describe; // 게시판 설명

    @OneToMany(mappedBy = "board", orphanRemoval = true)
    private List<Page> pages;

}
