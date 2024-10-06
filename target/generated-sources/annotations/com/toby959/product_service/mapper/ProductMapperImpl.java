package com.toby959.product_service.mapper;

import com.toby959.product_service.models.entity.Product;
import com.toby959.product_service.models.entity.dto.ProductResponse;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-06T14:50:39-0300",
    comments = "version: 1.6.2, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public ProductResponse toProductResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductResponse.ProductResponseBuilder productResponse = ProductResponse.builder();

        productResponse.id( product.getId() );
        productResponse.name( product.getName() );
        productResponse.description( product.getDescription() );
        productResponse.price( product.getPrice() );
        productResponse.category( categoryMapper.toCAtegoryResponse( product.getCategory() ) );

        productResponse.status( mapStatus(product) );

        return productResponse.build();
    }
}
