package com.gradle.springboot.entity.enums;

/**
 * @description 产品状态枚举类
 * @Author YouXu
 * @Date 2019/3/23 17:33
 **/
public enum  ProductStatus {
    AUDITING("审核中"),
    IN_SELL("销售中"),
    LOCKED("暂停销售"),
    FINISHED("已结束");

    ProductStatus(String desc) {
        this.desc = desc;
    }

    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
