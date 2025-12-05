package com.example.demo.data.dto;

import com.example.demo.data.entity.ProductEntity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {

    // @Size(min = 8, max = 8) // abcdefg
    @NotNull private String productId;

    @NotNull
    @Id
    private String productName;

    @NotNull
    @Min(value = 500)
    @Max(value = 3000000)
    private int productPrice;

    @NotNull
    @Min(value = 0)
    @Max(value = 9999)
    private int productStock;

}
