package com.opencode.springboot01.pojo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Data
@Table(name = "t_user")
@Entity
public class User {
    // 1、以自增的方式 2、绑定主键ID 3、映射数据库实际的字段名
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String username;
    private String password;
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
