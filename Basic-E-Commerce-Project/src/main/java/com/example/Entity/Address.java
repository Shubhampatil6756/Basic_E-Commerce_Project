package com.example.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String name;
    private String landmark;

    @Pattern(regexp = "^\\+\\d{2}\\d{10}$" , message = "Phone no should have 12 digits and first two digits will be county only.")
    private String phoneNumber;
    private String zipCode;
    private String status;

    @OneToOne
    @JoinColumn(name = "fk user id")
    User user;
}
