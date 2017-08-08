package com.dong.order.service.entity;

public class Order {

    private Long orderId;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private java.util.Date ctTime;

    /**
     * 创建时间
     */
    private java.util.Date modTime;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单状态
     * @return 订单状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置订单状态
     * @param status 订单状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     * @return 创建时间
     */
    public java.util.Date getCtTime() {
        return ctTime;
    }

    /**
     * 设置创建时间
     * @param ctTime 创建时间
     */
    public void setCtTime(java.util.Date ctTime) {
        this.ctTime = ctTime;
    }

    /**
     * 获取创建时间
     * @return 创建时间
     */
    public java.util.Date getModTime() {
        return modTime;
    }

    /**
     * 设置创建时间
     * @param modTime 创建时间
     */
    public void setModTime(java.util.Date modTime) {
        this.modTime = modTime;
    }

}