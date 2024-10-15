package com.demo.product_service.controller;

import com.demo.product_service.model.Product;
import com.demo.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public List<Product> saveProducts(@RequestBody List<Product> products){
        return productService.saveProducts(products);
    }

    @GetMapping("/groupByCategory")
    public Map<String, List<Product>> groupProductsByCategory(){
        return productService.groupProductsByCategory();
    }

    @GetMapping("/groupByBrand/{brand}")
    public List<Product> groupProductsByBrand(@PathVariable String brand){
        return productService.groupProductsByBrand(brand);
    }

    @GetMapping("/countByCategory")
    public Map<String,Integer> countProductsByCategory(){
        return productService.countProductsByCategory();
    }





}
