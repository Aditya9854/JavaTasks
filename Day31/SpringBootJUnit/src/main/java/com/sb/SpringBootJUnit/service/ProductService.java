package com.sb.SpringBootJUnit.service;

import com.sb.SpringBootJUnit.model.Product;
import com.sb.SpringBootJUnit.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository)
    {
        this.repository = repository;
    }

    public double calculateDiscountPrice(Long id)
    {
        Product product = repository.findById(id)
                .orElseThrow(()->new RuntimeException("Product not found"));

        if (product.getPrice() < 0)
        {
            throw new IllegalArgumentException("Invalid price data.");
        }
        if(product.getPrice() > 500.0)
        {
            return product.getPrice() * 0.8;
        }
        else
        {
            return product.getPrice() * 0.9;
        }
    }

}
