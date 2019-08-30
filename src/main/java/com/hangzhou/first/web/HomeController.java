package com.hangzhou.first.web;

import com.hangzhou.first.bean.Girl;
import com.hangzhou.first.vo.ResultMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.*;

@RestController
/*@CrossOrigin*/
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @Autowired
    private Girl girl;
    @Autowired
    private ServerProperties serverProperties;

    @GetMapping("/home")
    public ResultMap home() {

        return ResultMap.ok("成功");

    }
}
