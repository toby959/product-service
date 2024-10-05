package com.toby959.product_service.service;


import com.toby959.product_service.models.entity.dto.CreateProductRequest;
import com.toby959.product_service.models.entity.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    ProductResponse findById(Long id);

    List<ProductResponse> findAll();

    List<ProductResponse> findAllByCategoryId(Long categoryId);

    ProductResponse save(CreateProductRequest request);

    ProductResponse update(Long id, CreateProductRequest request);

    void deleteById(Long id);

}
