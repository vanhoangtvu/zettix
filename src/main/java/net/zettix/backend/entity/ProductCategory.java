package net.zettix.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id tư tăng
    @Column(nullable = false)
    private int id;  //id tự sinh

    @Column(nullable = false)
    private String namecategory; //tên category

    private String description; //mô tả

}
