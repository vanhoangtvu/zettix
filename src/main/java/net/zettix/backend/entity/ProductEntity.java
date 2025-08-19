package net.zettix.backend.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,length = 255)
    private String productname;

    @Column(length = 10000)
    private String description;

    @Column(nullable = false,precision = 12,scale = 2)
    private BigDecimal price;//dùng với đơn cị tiền tệ lưu đc 12 chử đơn vị tiền

    @Column(length = 300)
    private String imageUrl;//liên kết hình ảnh sp

    //lien kết với bảng category sản phẩm này thuộc category nào
    @ManyToOne(optional = false)
    @JoinColumn(name = "category_id")
    private ProductCategoryEntity category;

}
