package com.sb.main.service;

import com.sb.main.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    public double calculateFinalPrice(Long id)
    {
        return productRepository.findById(id)
                .map(product -> {
                    if (product.getPrice() < 0)
                    {
                        throw new IllegalArgumentException("Price cannot be negative.");
                    }
                    double taxRate = (product.getPrice() > 500) ? 1.10 :1.05;
                    return product.getPrice() * taxRate;
                })
                .orElseThrow(()-> new RuntimeException("Product Not Found"));
    }
}
