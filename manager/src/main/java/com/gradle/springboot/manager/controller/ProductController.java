package com.gradle.springboot.manager.controller;

import com.gradle.springboot.entity.Product;
import com.gradle.springboot.manager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/3/23 17:08
 **/
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/get/{id}")
    public Product getOne(@PathVariable String id){
        return null;
    }

    @PostMapping("/add")
    public Product addOne(@RequestBody Product product){
        return null;
    }

}
