package com.opencode.springboot01.repository;
import com.opencode.springboot01.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// 第一个参数：操作哪个类型的数据，主键ID的类型
@Repository   // 把当前的类注册为 spring 的 bean
public interface UserRepository extends CrudRepository<User, Integer> {

}
