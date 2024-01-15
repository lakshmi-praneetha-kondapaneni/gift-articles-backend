package com.giftarticlesshop.giftarticles.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="gift")
@Data
public class Gift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer giftId;
    private String giftName;
    private Double price;
    private Integer inStock;
    private String productDescription;
    private Double ratings;
}
