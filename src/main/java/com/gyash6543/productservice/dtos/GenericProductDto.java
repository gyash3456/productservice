package com.gyash6543.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericProductDto {
    private String title;
    private String description;
    private String image;
    private String category;
    private double price;
}
