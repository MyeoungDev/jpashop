package jpabook.jpashop.domain;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded   //JPA 내장타입으로 맵핑했다
    private Address address;

    @OneToMany(mappedBy = "member") //읽기 전용이 된다
    private List<Order> orders = new ArrayList<>();
}
