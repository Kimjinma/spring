package com.example.demo.data.dto;

import com.example.demo.data.entity.ProductEntity;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {

    private String productId;
    private String productName;
    private int productPrice;
    private int productStock;


}
