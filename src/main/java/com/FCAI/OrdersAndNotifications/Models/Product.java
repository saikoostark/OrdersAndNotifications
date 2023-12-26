package com.FCAI.OrdersAndNotifications.Models;

import lombok.Data;

@Data
public class Product {
    private String serialNumber;
    private String name;
    private String vendor;
    private Category category;
    private double price;

}
