package cn.whiteleaf03.blog.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    @Column(nullable = false, unique = true, length = 16)
    private String username;

    @Column(length = 32)
    private String password;

    @Column(nullable = false, unique = true, length = 64)
    private String email;

    @Column(nullable = false, length = 1)
    private int level = 0;
}
