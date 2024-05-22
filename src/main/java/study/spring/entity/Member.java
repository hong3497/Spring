package study.spring.entity;

import lombok.Data;
import lombok.Getter;

@Data
public class Member {

    private Long id;
    private String email;
    private String name;
    private String password;
}
