package com.drfjohngach.productservice.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
