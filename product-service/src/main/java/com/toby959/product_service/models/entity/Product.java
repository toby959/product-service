package com.toby959.product_service.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

// sino  @Column(columnDefinition = "TINYINT(1) DEFAULT 0")
    @Column(columnDefinition = " BIT(1) default b'0' ") // original BIT(1) default 0 ||
    private Boolean status;
}
