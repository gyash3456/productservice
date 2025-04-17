package com.gyash6543.productservice.controllers;

import com.gyash6543.productservice.dtos.GenericProductDto;
import com.gyash6543.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;;
    public ProductController(@Qualifier("FakeStoreProductService") ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public String getAllProducts() {
        return "All products";
    }
    @GetMapping("/{id}")
    public GenericProductDto getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }
}
