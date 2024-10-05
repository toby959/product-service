package com.toby959.product_service.mapper;

import com.toby959.product_service.models.entity.Product;
import com.toby959.product_service.models.entity.dto.ProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static com.toby959.product_service.utils.Constants.ACTIVE_STATUS;
import static com.toby959.product_service.utils.Constants.INACTIVE_STATUS;

// + uses mapear =>  Product
@Mapper(componentModel = "spring", uses = CategoryMapper.class)
public interface ProductMapper {

    @Mapping(target = "status", expression = "java(mapStatus(product))")
    ProductResponse toProductResponse(Product product);

    default String mapStatus(Product product) {
        return product.getStatus() ? ACTIVE_STATUS : INACTIVE_STATUS;
    }

}
