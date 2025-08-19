package net.zettix.backend.entity;

import jakarta.persistence.*;
import net.zettix.backend.entity.enu.GendereEnum;

import java.time.LocalDate;

@Entity
@Table(name = "userprofile")
public class UserProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(optional = false)
    @JoinColumn(name = "user_id",nullable = false,unique = true)
    private UserEntity user;

    @Column(length = 120)
    private String fullname;

    @Column(length = 20)
    private String phone;

    @Column(length = 300)
    private String avatarUrl;//anh đại điện

    @Column(length = 250)
    private String address;//dịa chỉ

    private LocalDate birthday;

    @Enumerated(EnumType.STRING)
    private GendereEnum gendere;


}
