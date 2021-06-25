package team.bbs.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@SequenceGenerator(
        sequenceName = "memberSeq",
        name = "memSeq"
)
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode(of = {"id", "pw", "email"})
public class Member {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "memSeq")
    @Column(name = "MemberNum")
    private Long num; // PK

    @Column(name = "MemberId")
    private String id; // 계정 ID

    @Column(name = "MemberPw")
    private String pw; // 계정 PW

    @Column(name = "MemberName")
    private String name; //이름

    @Column(name = "MemberEmail")
    private String email; // 계정 이메일

    @Column (name = "MemberAuthority")
    private String  authority; // 계정 권한

    @OneToMany(mappedBy = "member", orphanRemoval = true)
    private List<Page> pages;

    @OneToMany(mappedBy = "member", orphanRemoval = true)
    private List<Reply> replies;

    @Builder
    public Member(String id, String pw, String email, String authority){
        this.id=id;
        this.pw=pw;
        this.email=email;
        this.authority=authority;
    }



}
