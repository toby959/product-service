package com.toby959.product_service.models.entity.dto;


import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
public class CreateProductRequest {

    @NotEmpty(message = "The field name cannot be empty or null!!! ")
    private String name;

    private String description;
    @NotEmpty(message = "The field price cannot be null!!!")
    private BigDecimal price;

    @NotEmpty(message = "the field category _id cannot be null!!!")
    private Long category;
}
