package com.toby959.product_service.models.entity.dto;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CategoryResponse {

    private Long id;

    private  String name;
}
