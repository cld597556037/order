package com.dong.order.service.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.github.mybatisq.Query;
import com.dong.order.service.entity.Order;

@Mapper
public interface OrderMapper {

    int count(Query<OrderTable> query);

    List<Order> select(Query<OrderTable> query);

    int insert(Order order);

    int update(Order order);

    int delete(@Param("orderId") Long orderId);

}