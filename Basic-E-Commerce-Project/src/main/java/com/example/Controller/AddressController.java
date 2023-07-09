package com.example.Controller;

import com.example.Entity.Address;
import com.example.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("address")
    public String createAddress(@RequestBody Address address){
        return addressService.createAddress(address);
    }
}
