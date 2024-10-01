package ru.yandex.practicum.tele.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false)
    private String login;
}