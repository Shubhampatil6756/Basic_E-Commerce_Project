package com.example.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String name;
    @Email
    private String email;


    private String password;

    @Pattern(regexp = "^\\+\\d{2}\\d{10}$" , message = "Phone no should have 12 digits and first two digits will be county only.")
    private String phoneNumber;


}
