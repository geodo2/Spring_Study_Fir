package com.example.testporject.data.service;

import com.example.testporject.data.dto.ProductDTO;

public interface ProductService {
    ProductDTO saveProduct(String productId, String productName, int productPrice, int productStock);

    ProductDTO getProduct(String productId);
}
