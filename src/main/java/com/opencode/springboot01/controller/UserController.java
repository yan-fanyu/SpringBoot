package com.opencode.springboot01.controller;

import com.opencode.springboot01.pojo.User;
import com.opencode.springboot01.pojo.ResponseMessage;
import com.opencode.springboot01.pojo.dto.UserDto;
import com.opencode.springboot01.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

// 返回对象，且自动转化为 JSON 格式
@RestController
@RequestMapping("/user")
public class UserController {
    private Integer id;
    @Autowired
    IUserService userService;

    // 增 使用 post 方式
    @PostMapping
    public ResponseMessage add(@Validated @RequestBody UserDto user){
        User newUser = userService.add(user);
        return ResponseMessage.success(newUser);
    }

    // 查 使用 post 方式
    @GetMapping("/{id}")    // localhost:8080/user/1  method get
    public ResponseMessage add(@PathVariable Integer id){
        User newUser = userService.getUser(id);
        return ResponseMessage.success(newUser);
    }

    // 改
    @PutMapping
    public ResponseMessage edit(@Validated @RequestBody UserDto userDto){
        User newUser = userService.edit(userDto);
        return ResponseMessage.success(newUser);
    }

    // 删
    @DeleteMapping("/{id}")
    public ResponseMessage delete(@PathVariable Integer id){
        userService.delete(id);
        return ResponseMessage.success();
    }

}
