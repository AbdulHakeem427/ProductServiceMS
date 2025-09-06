package com.example.productservicecb.dto;

import com.example.productservicecb.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ListProductsResponseDTO {
    private List<Product> productList;
    private String responseMessage;
}
