package com.example.demospringweek7edo.repository;

import com.example.demospringweek7edo.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Products,Long> {
}
