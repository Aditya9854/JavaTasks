package com.sb.consumer_service.dto;

import java.io.Serializable;

public record OrderMessage(String orderId, String name, int quantity) implements Serializable
{}
