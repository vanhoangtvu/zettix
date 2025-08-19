package net.zettix.backend.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "category")
public class ProductCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id tư tăng
    @Column(nullable = false)
    private int id;  //id tự sinh

    @Column(nullable = false)
    private String namecategory; //tên category

    @Column(length = 10000)
    private String description; //mô tả

    @Column(length = 500)
    private String imageUrl;//ảnh cho category

}
