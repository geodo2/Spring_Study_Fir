package com.example.testporject.data.dao;

import com.example.testporject.data.entity.ProductEntity;
public interface ProductDAO {
    ProductEntity  saveProduct(ProductEntity productEntity);
    ProductEntity getProduct (String productId);
}
