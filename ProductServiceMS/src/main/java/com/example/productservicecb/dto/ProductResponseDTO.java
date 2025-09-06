package com.example.productservicecb.dto;

import com.example.productservicecb.models.Product;
import lombok.Getter;
import lombok.Setter;

//Why this? If every thing goes well, returns product & responseMessage; else, returns product as null & error message;
@Getter
@Setter
public class ProductResponseDTO {
    private Product product;
    private String responseMessage;

}
