package com.example.productservicecb.services;

import com.example.productservicecb.dto.FakeStoreRequestDTO;
import com.example.productservicecb.exceptions.DBNotFoundException;
import com.example.productservicecb.exceptions.DBTimeoutException;
import com.example.productservicecb.exceptions.ProductNotFoundException;
import com.example.productservicecb.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(String productId) throws ProductNotFoundException, DBTimeoutException, DBNotFoundException;

    List<Product> getAllProducts();

    List<Product> getProductsByCategoryName(String categoryName) throws ProductNotFoundException;

    List<Product> searchProducts(String searchText);

    //create object in your own DB.
    Product createProduct(Product product);

    //create object in FakeStore DB.
    Product createProduct(FakeStoreRequestDTO fakeStoreRequestDTO);
}
