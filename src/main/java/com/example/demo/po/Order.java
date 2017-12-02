package com.example.demo.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Macx on 2017/12/2.
 */
@ApiModel("订单")
public class Order {

    @ApiModelProperty("订单Id")
    private Integer id;

    @ApiModelProperty("订单名字")
    private String orderName;

    @ApiModelProperty("订单价格")
    private Double price;

    @ApiModelProperty("产品名称")
    private String productName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
