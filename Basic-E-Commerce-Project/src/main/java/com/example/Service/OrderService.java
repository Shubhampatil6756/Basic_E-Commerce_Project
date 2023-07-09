package com.example.Service;

import com.example.Entity.ProductOrder;
import com.example.Repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;

    public ProductOrder placeAnOrder(ProductOrder productOrder) {
        return orderRepo.save(productOrder);
    }

    public Optional<ProductOrder> getOrderById(Integer id) {
        return orderRepo.findById(id);
    }
}
