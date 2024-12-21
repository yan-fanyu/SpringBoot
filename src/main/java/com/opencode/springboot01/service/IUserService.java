package com.opencode.springboot01.service;

import com.opencode.springboot01.pojo.User;
import com.opencode.springboot01.pojo.dto.UserDto;

public interface IUserService {
    /**
     * 插入用户
     * @param userDto
     * @return
     */
    User add(UserDto userDto);

    /**
     * 根据传入的 id 查询用户
     * @param id
     * @return
     */
    User getUser(Integer id);

    /**
     * 根据 id 更改数据
     */
    User edit(UserDto userDto);

    /**
     * 根据 id 删除数据
     * @param id
     */
    void delete(Integer id);

}
