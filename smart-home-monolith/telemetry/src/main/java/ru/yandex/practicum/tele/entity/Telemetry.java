package ru.yandex.practicum.tele.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "telemetry_data")
@Data
public class Telemetry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Integer deviceId;
    @Column
    private String stream;
    @Column
    private float temperature;
}