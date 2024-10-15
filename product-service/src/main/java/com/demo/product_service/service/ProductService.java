package com.demo.product_service.service;

import com.demo.product_service.model.Product;
import com.demo.product_service.repository.ProductRepository;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    private final JPAStreamer jpaStreamer;

    @Autowired
    public ProductService(final JPAStreamer jpaStreamer) {
        this.jpaStreamer = jpaStreamer;
    }

    public Map<String, List<Product>> groupProductsByCategory() {
        return jpaStreamer.stream(Product.class)
                .collect(Collectors.groupingBy(Product::getCategory));
    }

    public List<Product> groupProductsByBrand(String brand) {
        return jpaStreamer.stream(Product.class)
                .filter(product -> product.getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }

    public List<Product> saveProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    public Map<String,Integer> countProductsByCategory(){
        return jpaStreamer.stream(Product.class)
                .collect(Collectors.groupingBy(Product::getCategory,Collectors.summingInt(product -> 1)));
    }

}
