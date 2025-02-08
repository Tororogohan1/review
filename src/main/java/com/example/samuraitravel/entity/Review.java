package com.example.samuraitravel.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reviews")

public class Review {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")	
    private int id;

    @ManyToOne
    @JoinColumn(name = "house_id", nullable = false)
    private House house; // 宿泊施設（他のエンティティにマッピング）

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // レビューを投稿したユーザー（他のエンティティにマッピング）

    @Column(nullable = false)
    private int rating; // 評価スコア

    @Column(columnDefinition = "TEXT")
    private String comment; // レビュー内容

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt; // 作成日時

    @Column(name = "updated_at")
    private LocalDateTime updatedAt; // 更新日時
 // **セッターを追加**
    public void setHouse(House house) {
        this.house = house;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // **ゲッターを追加**
    public House getHouse() {
        return house;
    }

    public User getUser() {
        return user;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
	
}
