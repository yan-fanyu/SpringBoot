package com.opencode.springboot01.service;

import com.opencode.springboot01.pojo.User;
import com.opencode.springboot01.pojo.dto.UserDto;
import com.opencode.springboot01.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // 标记成 spring 的 bean
public class UserService implements IUserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public User add(UserDto userDto) {
        User userPojo = new User();
        BeanUtils.copyProperties(userDto, userPojo);
        return userRepository.save(userPojo);
    }

    @Override
    public User getUser(Integer id) {
        return userRepository.findById(id).orElseThrow(() -> {
            throw new IllegalArgumentException("用户不存在，参数异常");
        });
    }

    @Override
    public User edit(UserDto userDto) {
        User userPojo = new User();
        BeanUtils.copyProperties(userDto, userPojo);
        return userRepository.save(userPojo);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }


}
