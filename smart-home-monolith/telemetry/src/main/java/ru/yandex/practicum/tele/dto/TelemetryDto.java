package ru.yandex.practicum.tele.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class TelemetryDto {
    @NonNull
    private String stream;
    @NonNull
    private Float temperature;
}