package com.codewithmosh.store.dtos;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class RegisterProductRequest {
    private String name;
    private String description;
    private BigDecimal price;
    private Byte categoryId;
}
