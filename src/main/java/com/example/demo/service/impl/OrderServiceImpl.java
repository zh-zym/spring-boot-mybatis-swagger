package com.example.demo.service.impl;

import com.example.demo.mapper.OrderMapper;
import com.example.demo.mapper.base.BaseMapper;
import com.example.demo.po.Order;
import com.example.demo.service.OrderService;
import com.example.demo.service.base.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Macx on 2017/12/2.
 */
@Service
public class OrderServiceImpl extends BaseServiceImpl<Order> implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public BaseMapper<Order> getMapper() {
        return orderMapper;
    }

}
