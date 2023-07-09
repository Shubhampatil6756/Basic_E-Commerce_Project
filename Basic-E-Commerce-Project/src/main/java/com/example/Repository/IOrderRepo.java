package com.example.Repository;

import com.example.Entity.ProductOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends CrudRepository<ProductOrder, Integer> {
}
