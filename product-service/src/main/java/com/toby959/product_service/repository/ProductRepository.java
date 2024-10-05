package com.toby959.product_service.repository;

import com.toby959.product_service.models.entity.Category;
import com.toby959.product_service.models.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByCategory(Category category);


}
