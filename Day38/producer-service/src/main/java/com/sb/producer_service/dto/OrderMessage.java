package com.sb.producer_service.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderMessage implements Serializable {

    private String orderId;
    private String name;
    private int quantity;

}
