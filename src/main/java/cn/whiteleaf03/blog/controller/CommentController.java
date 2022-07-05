package cn.whiteleaf03.blog.controller;

import cn.whiteleaf03.blog.entity.Comment;
import cn.whiteleaf03.blog.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/comment")
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping(value = "/findAll")
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    @PostMapping(value = "/add")
    public void add(Comment comment) {
        comment.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        commentRepository.save(comment);
    }

    @PostMapping(value = "/quickAdd")
    public String quickAdd(String username, String email, String message) {
        String result;
        System.out.println(username + email + message);
        commentRepository.save(new Comment(username, email, message));
        result = "评论成功";
        return result;
    }
}
