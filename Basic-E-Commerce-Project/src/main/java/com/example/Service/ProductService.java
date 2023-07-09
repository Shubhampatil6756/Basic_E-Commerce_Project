package com.example.Service;

import com.example.Entity.Category;
import com.example.Entity.Product;
import com.example.Repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;

    public String createProduct(Product product) {
        productRepo.save(product);
        return "Product added successfully..";
    }

    public List<Product> getAllProducts() {
        return (List<Product>) productRepo.findAll(); // because its returning iterable so I typecasted here
    }

    public List<Product> getProductsByCategory(Category category) {
        return productRepo.findByCategory(category);
    }


    public String deleteProductById(Integer id) {
        if(productRepo.existsById(id)){
            productRepo.deleteById(id);
            return "Product deleted successfully..";
        }
        return "Product already deleted or not found..";
    }
}
