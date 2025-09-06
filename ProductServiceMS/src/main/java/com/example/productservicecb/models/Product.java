package com.example.productservicecb.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends BaseModel{
    //All these are primitive datatypes
    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private Double discount;
    //This is non-primitive
    //I have to define relation between Product & Category.
    //=>Cardinality
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}) //when you create Product it should cascade the changes and create category. when you delete it should stop
    @JsonBackReference  // Child side //perplexity
    private Category category;

}
