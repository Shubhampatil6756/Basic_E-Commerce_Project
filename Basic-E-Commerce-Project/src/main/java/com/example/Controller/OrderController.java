package com.example.Controller;

import com.example.Entity.ProductOrder;
import com.example.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("order")
    public ProductOrder placeAnOrder(@RequestBody ProductOrder productOrder){
        return orderService.placeAnOrder(productOrder);
    }

    @GetMapping("order/id/{id}")
    public Optional<ProductOrder> getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }
}
