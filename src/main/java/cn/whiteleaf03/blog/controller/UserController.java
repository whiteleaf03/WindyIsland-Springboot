package cn.whiteleaf03.blog.controller;

import cn.whiteleaf03.blog.entity.User;
import cn.whiteleaf03.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/user")
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

    @PostMapping(value = "/login")
    public String userLogin(String username, String password) {
        User user = userRepository.findUserByUsernameAndPassword(username, password);
        if (user != null) {
            return "登录成功";
        } else {
            return "账号名或密码错误";
        }
    }
}
