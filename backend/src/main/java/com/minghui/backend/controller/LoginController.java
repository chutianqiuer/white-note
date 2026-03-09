// controller/LoginController.java
package com.minghui.backend.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Objects;

// 使用 Record 定义数据模型，省去所有 Getter/Setter
record User(String username, String password) {}
record Result(int code) {}

@RestController
@RequestMapping("/api")
public class LoginController {

    @CrossOrigin
    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        if (Objects.equals("admin", user.username()) && Objects.equals("123456", user.password())) {
            return new Result(200);
        }
        return new Result(400);
    }
}