package com.gradle.springboot.manager.repositories;

import com.gradle.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/3/25 14:33
 **/
public interface UserRepository extends JpaRepository<User,Integer> {

//    @Query(value = "select o from User o where id = (select max(id) from User o)" )
    @Query(value = "select * from t_user where id = (select max(id) from t_user)",nativeQuery = true)
    public User findMaxIdUser();
}
