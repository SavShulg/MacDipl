package ru.skypro.homework.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@Table(name = "adds")
public class Add {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private BigDecimal price;
    private String title;
    private String description;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;
    @OneToMany(mappedBy = "ads", cascade = CascadeType.ALL)
    private List<Comment> comments;
    @OneToMany(mappedBy = "ads", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Image> images;
}
