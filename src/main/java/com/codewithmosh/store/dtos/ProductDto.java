package com.codewithmosh.store.dtos;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link com.codewithmosh.store.entities.Product}
 */
@Data
public class ProductDto{
    Long id;
    String name;
    String description;
    BigDecimal price;
    Byte categoryId;
}