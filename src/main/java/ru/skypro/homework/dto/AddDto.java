package ru.skypro.homework.dto;

import lombok.Data;

@Data
public class AddDto {

    private long authorId;
    private String image;
    private String pk;
    private String title;
    private String description;
    private String authorFirstName;
    private String authorLastName;
    private String email;
    private String phone;
    private int price;
}
