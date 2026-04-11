package com.sb.notification_service.model;

public class OrderEvent {

    private String orderId;
    private String product;
    private double price;
    private String status;

    public OrderEvent(){}

    public OrderEvent(String orderId,String product,double price,String status)
    {
        this.orderId = orderId;
        this.product = product;
        this.price = price;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
