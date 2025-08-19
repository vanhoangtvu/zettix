package net.zettix.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "AccountCredential")//tài khoản để bán cho khách hàng
public class ProductAccountCredential {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


}
