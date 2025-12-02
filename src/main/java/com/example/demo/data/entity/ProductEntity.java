package com.example.demo.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product")
public class ProductEntity {


    @Id
    String productId;
    private String productName;
    private int productPrice;
    private int productStock;


}
