package com.example.Repository;

import com.example.Entity.Address;
import com.example.Entity.Category;
import com.example.Entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends CrudRepository<Product, Integer> {

    List<Product> findByCategory(Category category);
}
