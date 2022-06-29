package cn.whiteleaf03.blog.controller;

import cn.whiteleaf03.blog.entity.Comment;
import cn.whiteleaf03.blog.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/comment")
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping(value = "/findAll")
    private List<Comment> findAll() {
        return commentRepository.findAll();
    }

    @PostMapping(value = "/add")
    private void add(Comment comment) {
        comment.setTime(new Date());
        commentRepository.save(comment);
    }
}
