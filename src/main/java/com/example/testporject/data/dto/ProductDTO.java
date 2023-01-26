package com.example.testporject.data.dto;

import com.example.testporject.data.entity.ProductEntity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDTO {

    private String productId;

    private String productName;

    private int productPrice;

    private int productStock;

    public ProductEntity toEntity(){
        return ProductEntity.builder()
                .productId(productId)
                .productName(productName)
                .productPrice(productPrice)
                .productStocks(productStock)
                .build();

    }
}
