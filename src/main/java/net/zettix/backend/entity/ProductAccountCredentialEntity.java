package net.zettix.backend.entity;

import jakarta.persistence.*;
import net.zettix.backend.entity.enu.AccountCredentialStatusEnum;


@Entity
@Table(name = "AccountCredential")//tài khoản để bán cho khách hàng
public class ProductAccountCredentialEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //liên kết với bảng product
    @ManyToOne(optional = false)
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    //tài khoản
    @Column(nullable = false,length = 150)
    private String login;//tên đang nhập,email của tài khoản

    @Column(nullable = false,length = 150)
    private String secret; //pass, apiket, keylicen của tai khoản.

    //trạng thái của tài khoản set theo Enum
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountCredentialStatusEnum status = AccountCredentialStatusEnum.AVAILABLE;

}
