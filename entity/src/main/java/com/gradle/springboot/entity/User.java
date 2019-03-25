package com.gradle.springboot.entity;

import javax.persistence.*;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/3/25 14:12
 **/
@Entity
@Table(name = "t_user")
public class User {
    @Id
    //主键自动递增
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 20)
    private Integer id;
    @Column(length = 20)
    private String name;
    @Column(length = 4)
    private Integer age;
    @Column(length = 50)
    private String addr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }
}
