package cn.whiteleaf03.blog.controller;

import cn.whiteleaf03.blog.entity.Comment;
import cn.whiteleaf03.blog.entity.User;
import cn.whiteleaf03.blog.repository.CommentRepository;
import cn.whiteleaf03.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/comment")
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    private UserRepository userRepository;

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
    public void quickAdd(String username, String useremail, String message) {
        List<User> list = userRepository.findByUsernameAndUseremail(username, useremail);
        for (User user : list) {
            Comment comment = new Comment(message, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), user.getUid());
            commentRepository.save(comment);
        }
    }
}
