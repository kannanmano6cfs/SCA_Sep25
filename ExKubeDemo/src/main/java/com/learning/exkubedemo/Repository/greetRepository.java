package com.learning.exkubedemo.Repository;

import com.learning.exkubedemo.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface greetRepository extends JpaRepository<Product, Integer> {
}
