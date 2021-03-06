package com.food.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Getter @Setter
public class BoardFormDto {

    private Long id;

    @NotEmpty(message = "제목은 필수 입력 값입니다.")
    private String title;

    @NotEmpty(message = "내용은 필수 입력 값입니다.")
    private String content;

    @NotBlank(message = "메뉴이름 필수 입력 값 입니다.")
    private String menu;    // 메뉴

    private int hit; // 조회수 증가

}
