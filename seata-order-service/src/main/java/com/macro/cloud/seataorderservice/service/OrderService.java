package com.macro.cloud.seataorderservice.service;


import com.macro.cloud.seataorderservice.domain.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
