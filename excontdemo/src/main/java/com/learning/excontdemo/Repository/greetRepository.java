package com.learning.excontdemo.Repository;

import com.learning.excontdemo.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface greetRepository extends JpaRepository<Product,Integer> {
}
