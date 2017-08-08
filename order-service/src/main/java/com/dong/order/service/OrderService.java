package com.dong.order.service;

import com.dong.order.service.entity.Order;
import com.dong.order.service.mapper.OrderMapper;
import com.dong.order.service.mapper.OrderTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderService {

    @Autowired
    public OrderMapper orderMapper;

    @RequestMapping("get/{orderId}")
    @ResponseBody
    public Order getOrder(@PathVariable("orderId")Long orderId) {
        OrderTable o = OrderTable.t_order;
        List<Order> orders = orderMapper.select(o.query().where(o.order_id.eq(orderId)));
        return orders == null ? null : orders.get(0);
    }

    public void insertOrder() {

    }
}
