package com.example.demo.data.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product")
public class ProductEntity extends BaseEntity{


    @Id
     String productId;
     String productName;
     Integer productPrice;
     Integer productStock;


}
