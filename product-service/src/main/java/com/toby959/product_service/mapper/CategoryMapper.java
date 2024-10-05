package com.toby959.product_service.mapper;


import com.toby959.product_service.models.entity.Category;
import com.toby959.product_service.models.entity.dto.CategoryResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

//@Mapping(target = "name", source = "nombre")
//    -- target --                    -- source --
    CategoryResponse toCAtegoryResponse(Category category);
}
