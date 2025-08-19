package net.zettix.backend.entity;
import jakarta.persistence.*;
import net.zettix.backend.entity.enu.RoleEnum;
import net.zettix.backend.entity.enu.UserStatusEnum;

@Entity
@Table(name ="user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable=false,unique = true, length = 100) //ko đc null, ko trùng, độ dài tối đa của username là 100 ký tự)
    private String username;

    @Column(nullable=false,unique = true, length = 200) //ko đc null, ko trùng, độ dài tối đa của email là 200 ký tự)
    private String email;

    @Column(nullable = false) //pass ko null
    private String passwordHash; //passwordHash mật khẩu mã hóa

    @Column(length = 100)
    private String oldPasswordHash;// mật khảu củ

    private RoleEnum role; //enum

    @Enumerated(EnumType.STRING)
    @Column(nullable=false, length = 20)
    private UserStatusEnum status;
}
