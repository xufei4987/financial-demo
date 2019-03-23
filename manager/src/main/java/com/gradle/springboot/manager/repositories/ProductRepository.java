package com.gradle.springboot.manager.repositories;

import com.gradle.springboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * @description 产品查询接口
 * @Author YouXu
 * @Date 2019/3/23 18:00
 **/
public interface ProductRepository extends CrudRepository<Product, String>, JpaRepository<Product, String> {
}
