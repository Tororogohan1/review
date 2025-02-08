package com.example.samuraitravel.form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class RegisterForm {

    @NotNull(message = "評価してください")
    @Min(value = 1, message = "評価は星1以上にしてください")
    @Max(value = 5, message = "評価は星5以下にしてください")
    private Integer rating; // 評価スコア

    @NotBlank(message = "コメントを記入してください")
    private String comment; // レビュー内容

    // **ゲッターとセッター**
    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}