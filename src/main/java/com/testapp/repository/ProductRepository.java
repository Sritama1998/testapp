package com.testapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.testapp.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
