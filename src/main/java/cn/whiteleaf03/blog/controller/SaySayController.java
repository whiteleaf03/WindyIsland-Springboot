package cn.whiteleaf03.blog.controller;

import cn.whiteleaf03.blog.entity.SaySay;
import cn.whiteleaf03.blog.repository.SaySayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/saysay")
public class SaySayController {
    @Autowired
    private SaySayRepository saySayRepository;

    @GetMapping(value = "/findAll")
    public List<SaySay> findAll() {
        return saySayRepository.findAll();
    }

    @PostMapping(value = "/add")
    public void add(SaySay saySay) {
        saySay.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        saySayRepository.save(saySay);
    }
}
