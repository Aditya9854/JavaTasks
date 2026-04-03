package com.sb.SpringBootJUnit.repository;

import com.sb.SpringBootJUnit.model.Product;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductRepository {

    Optional<Product> findById(Long id);

}
