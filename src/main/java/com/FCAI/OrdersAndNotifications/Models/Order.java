package com.FCAI.OrdersAndNotifications.Models;

// import java.time.LocalDateTime;
// import java.util.HashMap;

import lombok.Data;

@Data
abstract public class Order {

    abstract public void addOrder(Order order);

}
