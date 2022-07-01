package cn.whiteleaf03.blog.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Data
public class Comment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;

    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private String time;

    @Column(nullable = false, length = 16)
    private String username;

    @Column(nullable = false, length = 64)
    private String email;

    public Comment() {}

    public Comment(String username,String email,String message) {
        this.username = username;
        this.email = email;
        this.message = message;
        this.time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
