package com.example.C2Sprint1Demowork.Respository;

import com.example.C2Sprint1Demowork.Domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

// this annotation informs tthe spring the to create the container and
public interface ProductRepository extends JpaRepository<Product, Integer> {
   List<Product> findByName(String name);


}
