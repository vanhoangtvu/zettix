package net.zettix.backend.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "userpasswordhistory")
public class UserPasswordHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //kết nối với bảng user
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private UserEntity user; //lay tu bảng user

    @Column(nullable = false,length = 100)
    private String passwordHash;

    @Column(nullable = false,updatable = false)
    private Instant changedAt = Instant.now(); //lưu thời điểm mật khẩu đc thay đổi.
}
