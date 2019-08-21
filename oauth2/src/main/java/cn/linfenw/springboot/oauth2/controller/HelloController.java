/**
 * Company
 * Copyright (C) 2019-2019 All Rights Reserved.
 */
package cn.linfenw.springboot.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by linfen
 * 2019-08-21 15:51
 */
@RestController
public class HelloController {

    @GetMapping("/admin/hello")
    public String admin() {
        return "Hello Admin!";
    }

    @GetMapping("/user/hello")
    public String user() {
        return "Hello User!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }
}
