package com.productcatalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Create a product
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    // Get a product by ID
    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Update product
    public Product updateProduct(String id, Product product) {
        if (productRepository.existsById(id)) {
            product.setId(id);
            return productRepository.save(product);
        }
        return null;
    }

    // Delete product
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
