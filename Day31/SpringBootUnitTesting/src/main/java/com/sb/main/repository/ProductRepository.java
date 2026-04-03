package com.sb.main.repository;

import com.sb.main.model.Product;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductRepository {

    Optional<Product> findById(Long id);
}
