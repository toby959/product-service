package com.toby959.product_service.models.entity.dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
public class CreateProductRequest {

    @NotEmpty(message = "The field name cannot be empty or null!!! ")
    private String name;

    @NotEmpty(message = "The field description cannot be empty or null!!! ")
    private String description;



//    @NotEmpty(message = "The field price cannot be null!!!")
// @NotEmpty solo se usa para String
    @Positive(message = "The field price must be greater than zero!!!")
    private BigDecimal price;

//    @NotEmpty(message = "the field category _id cannot be null!!!")
    @NotNull(message = "The field category_id cannot be null!!!")
    private Long categoryId;
}
