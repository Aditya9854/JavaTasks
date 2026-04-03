package com.sb.main.service;

import com.sb.main.model.Product;
import com.sb.main.repository.ProductRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    @DisplayName("Logic Branch : High price should apply 10% tax")
    void testCalculatePrice_HighTax()
    {
        //arrange
        Product p = new Product(1l,"Console",600.0);
        when(productRepository.findById(1l)).thenReturn(Optional.of(p));

        //act
        double result = productService.calculateFinalPrice(1l);

        //assert
        assertEquals(660.0,result);
        verify(productRepository).findById(1l);

    }
    @Test
    @DisplayName("Logic Branch: Low price should apply 5% tax")
    void testCalculatePrice_LowTax()
    {
        //arrange
        Product p = new Product(2l,"Game",100.0);
        when(productRepository.findById(2l)).thenReturn(Optional.of(p));

        //act
        double result = productService.calculateFinalPrice(2l);

        //assert
        assertEquals(105.0,result);
    }

    @Test
    @DisplayName("Invalid Input : Negative input should throw exception.")
    void testCalculatePrice_Negative()
    {
        //arrange
        Product p = new Product(3l,"Error",-50.0);
        when(productRepository.findById(3l)).thenReturn(Optional.of(p));

        //act & assert
        assertThrows(IllegalArgumentException.class,()->productService.calculateFinalPrice(3l));
    }

    @Test
    @DisplayName("Invalid Input: Missing Product should throw exception")
    void testCalculatePrice_NotFound()
    {
        //arrange
        when(productRepository.findById(99l)).thenReturn(Optional.empty());

        //act & assert
        assertThrows(RuntimeException.class,()->productService.calculateFinalPrice(99l));
    }
}
