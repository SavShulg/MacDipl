package ru.skypro.homework.dto;

import lombok.Data;

@Data
public class CommentDto {
    private int authorId;
    private String createdAt;
    private String text;
    private int image;



}
