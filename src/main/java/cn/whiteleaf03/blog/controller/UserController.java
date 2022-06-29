package cn.whiteleaf03.blog.controller;

import cn.whiteleaf03.blog.entity.User;
import cn.whiteleaf03.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/findAll")
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @PostMapping(value = "/add")
    public void addUser(User user) {
        userRepository.save(user);
    }
}
