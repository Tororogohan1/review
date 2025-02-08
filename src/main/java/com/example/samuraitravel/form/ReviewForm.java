package com.example.samuraitravel.form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewForm {

    @NotNull(message = "評価してください")
    @Min(value = 1, message = "評価は星1以上にしてください")
    @Max(value = 5, message = "評価は星5以下にしてください")
    private Integer rating; // **評価スコア（1〜5）**

    @NotBlank(message = "コメントを記入してください")
    private String comment; // **レビュー内容**
}
