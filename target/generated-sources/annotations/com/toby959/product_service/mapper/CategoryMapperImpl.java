package com.toby959.product_service.mapper;

import com.toby959.product_service.models.entity.Category;
import com.toby959.product_service.models.entity.dto.CategoryResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-06T14:50:39-0300",
    comments = "version: 1.6.2, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryResponse toCAtegoryResponse(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryResponse.CategoryResponseBuilder categoryResponse = CategoryResponse.builder();

        categoryResponse.id( category.getId() );
        categoryResponse.name( category.getName() );

        return categoryResponse.build();
    }
}
