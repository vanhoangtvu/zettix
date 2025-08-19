package net.zettix.backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Builder;
import net.zettix.backend.entity.enu.ReviewStatusEnum;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Builder
@Entity
@Table(name = "product_review",
        indexes = {//dat index de lay nhanh hon tu csdl
                @Index(name = "idx_reviews_product", columnList = "id"),
                @Index(name = "idx_reviews_status", columnList = "status")
        })
public class ProductReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    //ngươi cmt đánh giá liên kết vs bang user
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @Column(nullable = false)
    @Min(1) @Max(5)
    private Integer rating; //dánh giá

    @Column(length = 200)
    private String title;// Tieu de danh giá

    @Column(length = 1000)
    private String comment;// Noi dung danh gia

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    @Builder.Default
    private ReviewStatusEnum status = ReviewStatusEnum.PENDING;// Trang thai duyet


    @Column(nullable = false)
    @Builder.Default
    private Boolean verifiedPurchase = false;// Da xac thuc mua hang chua

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Instant createdAt;//thoi gian danh gia

    @UpdateTimestamp
    @Column(nullable = false)
    private Instant updatedAt;//thoi gian cap nhat danh gia

}
