package service;

import com.sb.SpringBootJUnit.model.Product;
import com.sb.SpringBootJUnit.repository.ProductRepository;
import com.sb.SpringBootJUnit.service.ProductService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
    @Mock
    private ProductRepository repository;

    @InjectMocks
    private ProductService productService;

    @BeforeAll
    static void initSuite()
    {
        System.out.println("Starting product Service test suit..");
    }
    @BeforeEach
    void setup()
    {
        System.out.println("Running test cases setup...");
    }
    @Test
    @DisplayName("Branch 1: Apply 20% discount for prices > 500")
    void testHighPriceDiscount()
    {
        //arrange
        Product p = new Product(1l,"laptop",1000.0);
        when(repository.findById(1l)).thenReturn(Optional.of(p));

        //act
        double result = productService.calculateDiscountPrice(1l);
        //assert
        assertEquals(800.0,result,"Should apply 20% discount");
        verify(repository,times(1)).findById(1l);
    }

    @Test
    @DisplayName("Branch 2: Apply 10% discount for prices <= 500")
    void testStandardPriceDiscount()
    {
        //arrange
        Product p = new Product(2l,"mouse",100.0);
        when(repository.findById(2l)).thenReturn(Optional.of(p));

        //act
        double result = productService.calculateDiscountPrice(2l);
        //assert
        assertEquals(90.0,result);
    }

    @Test
    @DisplayName("Exception: Throw RuntimeException when id is missing.")
    void testProductNotFound()
    {
        when(repository.findById(99l)).thenReturn(Optional.empty());

        //act & assert
        RuntimeException exception = assertThrows(RuntimeException.class,()->productService.calculateDiscountPrice(99l));

        assertEquals("Product not found",exception.getMessage());
    }

    @AfterEach
    void teardown()
    {
        System.out.println("Cleaning up after test case...");
    }

    @AfterAll
    static void cleanupSuit()
    {
        System.out.println("All tests completed..");
    }
}
