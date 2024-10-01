package ru.yandex.practicum.tele.service;

import ru.yandex.practicum.tele.dto.TelemetryDto;

public interface TelemetryService {
    void process(int id, TelemetryDto data);
}
