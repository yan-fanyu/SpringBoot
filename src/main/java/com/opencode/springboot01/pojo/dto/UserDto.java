package com.opencode.springboot01.pojo.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class UserDto {
    // 用户 id
    private Integer id;
    @NotBlank(message = "用户名不能为空")
    private String username;
    @Length(min = 0, max = 18)
    @NotBlank(message = "密码不能为空")
    private String password;
    @Email(message = "email格式不正确")
    private String email;
}
