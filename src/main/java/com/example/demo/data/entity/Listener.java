package com.example.demo.data.entity;

import com.example.demo.data.entity.listner.CustomListener;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "listener")
@EntityListeners(CustomListener.class)
public class Listener {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}