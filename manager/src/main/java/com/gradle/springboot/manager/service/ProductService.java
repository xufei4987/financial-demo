package com.gradle.springboot.manager.service;

import com.gradle.springboot.entity.Product;
import com.gradle.springboot.entity.enums.ProductStatus;
import com.gradle.springboot.manager.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description 商品服务类
 * @Author YouXu
 * @Date 2019/3/23 17:50
 **/
@Service
public class ProductService {
    private static Logger LOG = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    ProductRepository repository;
    /**
     * 创建产品
     */
    public Product addProduct(Product product){
        LOG.debug("创建产品,参数为{}" + product);
        // 数据校验
        checkProduct(product);
        //设置默认值
        setDefault(product);

        Product result = repository.save(product);

        LOG.debug("创建产品,结果为:{}" + result);

        return result;
    }


    /**
     * 查询单个产品
     *
     * @param id 产品编号
     * @return 返还对应产品或者null
     */
    public Product findOne(String id) {
        Assert.notNull(id, "需要产品编号参数");
        LOG.debug("查询单个产品，id={}", id);

        //查询到就返回product 未查询到就返回null
        Product product = repository.findById(id).orElse(null);

        LOG.debug("查询单个产品,结果={}", product);

        return product;
    }

    /**
     * 设置默认值
     * 创建时间、更新时间
     * 投资步长、锁定期、状态
     *
     * @param product
     */
    private void setDefault(Product product) {
        if (product.getCreateAt() == null) {
            product.setCreateAt(new Date());
        }
        if (product.getUpdateAt() == null) {
            product.setUpdateAt(new Date());
        }
        if (product.getStepAmount() == null) {
            product.setStepAmount(BigDecimal.ZERO);
        }
        if (product.getLockTerm() == null) {
            product.setLockTerm(0);
        }
        if (product.getStatus() == null) {
            product.setStatus(ProductStatus.AUDITING.name());
        }
    }
    /**
     * 产品数据校验
     * 1. 非空数据
     * 2. 收益率要0-30以内
     * 3. 投资步长需为整数
     *
     * @param product
     */
    private void checkProduct(Product product) {
        Assert.notNull(product.getId(), "编号不可为空");
        //其他非空校验
        Assert.isTrue(BigDecimal.ZERO.compareTo(product.getRewardRate()) < 0 && BigDecimal.valueOf(30).compareTo(product.getRewardRate()) >= 0, "收益率范围错误");

        Assert.isTrue(BigDecimal.valueOf(product.getStepAmount().longValue()).compareTo(product.getStepAmount()) == 0, "投资步长需为整数");

    }
}
