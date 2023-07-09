package com.example.Repository;

import com.example.Entity.Address;
import com.example.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User, Integer> {
}
