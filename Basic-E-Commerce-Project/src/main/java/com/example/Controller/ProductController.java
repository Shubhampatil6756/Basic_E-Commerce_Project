package com.example.Controller;

import com.example.Entity.Category;
import com.example.Entity.Product;
import com.example.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("product")
    public String createProduct(Product product){
        return productService.createProduct(product);
    }

    @GetMapping("products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("products/category/{category}")
    public List<Product> getProductsByCategory(@RequestParam Category category){
        return productService.getProductsByCategory(category);
    }

    @DeleteMapping("product/id/{id}")
    public String deleteProductById(@PathVariable Integer id){
        return productService.deleteProductById(id);
    }

}
