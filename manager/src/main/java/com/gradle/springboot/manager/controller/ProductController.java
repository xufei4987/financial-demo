package com.gradle.springboot.manager.controller;

import com.gradle.springboot.entity.Product;
import com.gradle.springboot.manager.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description TODO
 * @Author YouXu
 * @Date 2019/3/23 17:08
 **/
@RestController
@RequestMapping("/product")
@Api("商品接口")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/get/{id}")
    @ApiOperation("获取单个商品接口")
    public Product getOne(@PathVariable String id){
        return null;
    }

    @PostMapping("/add")
    @ApiOperation("增加单个商品接口")
    public Product addOne(@RequestBody Product product){
        return null;
    }

}
