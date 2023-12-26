package com.FCAI.OrdersAndNotifications.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.FCAI.OrdersAndNotifications.Models.*;

@RestController
public class ProductController {

    @GetMapping("/")
    public List<Product> getAllProduct() {
        List<Product> p = new ArrayList<>();

        Category cat = new Category();
        cat.setID(14);
        cat.setName("sweets");

        Product p1 = new Product();
        p1.setSerialNumber("3321");
        p1.setName("cake");
        p1.setPrice(12.6);
        p1.setCategory(cat);
        p1.setVendor("saikoo");
        Product p2 = new Product();
        p2.setSerialNumber("3322");
        p2.setName("cake");
        p2.setPrice(12.6);
        p2.setCategory(cat);
        p2.setVendor("saikoo");
        Product p3 = new Product();
        p3.setSerialNumber("3323");
        p3.setName("cake");
        p3.setPrice(12.6);
        p3.setCategory(cat);
        p3.setVendor("saikoo");

        // cat.getProducts().add(p1);
        // cat.getProducts().add(p2);
        // cat.getProducts().add(p3);

        p.add(p1);
        p.add(p2);
        p.add(p3);

        return p;
    }
}
