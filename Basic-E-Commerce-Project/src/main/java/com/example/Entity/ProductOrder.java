package com.example.Entity;

import com.example.Entity.Address;
import com.example.Entity.Product;
import com.example.Entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name = "fk user id")
    private User user;

    @OneToOne
    @JoinColumn(name = "fk product id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "fk address id")
    private Address address;

    private Integer productQuantity;

}
