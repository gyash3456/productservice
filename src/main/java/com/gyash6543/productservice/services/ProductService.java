package com.gyash6543.productservice.services;

import com.gyash6543.productservice.dtos.GenericProductDto;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;


public interface ProductService {
   public GenericProductDto createProduct(GenericProductDto genericProductDto);
    public GenericProductDto getProductById(Long id);
    public List<GenericProductDto> getAllProducts();
    public GenericProductDto deleteProduct(Long id) throws HttpClientErrorException.NotFound;;

}
