package net.zettix.backend.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//id sp

    @Column(nullable = false)
    private String productname;//ten sp

    @Column(nullable = false, precision = 18, scale = 2)
    private BigDecimal price;

    @Column(length = 1000)
    private String description;//mo ta

    @Column(nullable = false)
    private Boolean active = true;//trạng thái hoạt động

    @Column(nullable = false, updatable = false)
    private Instant createdAt = Instant.now();//thoi gian tạo sp


}
