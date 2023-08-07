package com.example.orderservice.services;


import com.example.orderservice.dtos.OrderProductCreateDto;
import com.example.orderservice.dtos.ProductDto;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface IProductServiceClient {
    Optional<ProductDto> getProductById(Long id);

    Map<Long, ProductDto> getProductById(Set<Long> ids);

    boolean updateStock(List<OrderProductCreateDto> ids);
}