package com.example.productservicecb.dto;


import com.example.productservicecb.models.Category;
import com.example.productservicecb.models.Product;
import lombok.Getter;
import lombok.Setter;

// purpose to get response from outside world(FakeStoreAPI).
// we place this inside DTO(Data Transfer Objects).
@Getter
@Setter
public class FakeStoreResponseDTO {
    private String id;
    private String title;
    private Integer price;
    private String description;
    private String image;
    private String category;


    public Product toProduct(){
        Product product = new Product();
        product.setId(Long.valueOf(this.id));
        product.setName(this.title);
        product.setPrice(this.price * 1.0);
        product.setDescription(this.description);
        product.setImageUrl(this.image);
        Category category = new Category();
        category.setName(this.category);
        product.setCategory(category);
        return product;
    }

}
