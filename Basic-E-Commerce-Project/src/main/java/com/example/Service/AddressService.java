package com.example.Service;

import com.example.Entity.Address;
import com.example.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String createAddress(Address address) {
        addressRepo.save(address);
        return "Address is added successfully..";
    }
}
