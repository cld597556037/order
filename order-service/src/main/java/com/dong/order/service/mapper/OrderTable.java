package com.dong.order.service.mapper;

import com.github.mybatisq.Column;
import com.github.mybatisq.Join;
import com.github.mybatisq.Query;
import com.github.mybatisq.Table;

public class OrderTable extends Table {

    private OrderTable() {
        super("t_order", "t");
    }

    public static final OrderTable t_order = new OrderTable();

    public Query<OrderTable> query() {
        return new Query<>(t_order);
    }

    public <T extends Table> Join<OrderTable, T> inner(T table) {
        return new Join<>("inner", this, table);
    }

    public Column<OrderTable, Long> order_id = new Column<>("order_id");

    /**
     * 订单状态
     */
    public Column<OrderTable, Integer> status = new Column<>("status");

    /**
     * 创建时间
     */
    public Column<OrderTable, java.util.Date> ct_time = new Column<>("ct_time");

    /**
     * 创建时间
     */
    public Column<OrderTable, java.util.Date> mod_time = new Column<>("mod_time");
}