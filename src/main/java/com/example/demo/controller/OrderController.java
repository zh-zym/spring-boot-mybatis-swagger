package com.example.demo.controller;

import com.example.demo.controller.base.BaseController;
import com.example.demo.po.Order;
import com.example.demo.service.OrderService;
import com.example.demo.service.base.BaseService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Macx on 2017/12/2.
 */
@Api(tags = "订单",value = "订单")
@RestController
@RequestMapping("/order")
public class OrderController extends BaseController<Order> {

    @Autowired
    private OrderService orderService;

    @Override
    public BaseService<Order> getService() {
        return orderService;
    }


}
