package ru.yandex.practicum.tele.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.yandex.practicum.tele.dto.Mapper;
import ru.yandex.practicum.tele.dto.TelemetryDto;
import ru.yandex.practicum.tele.repository.TelemetryRepository;

@Service
@RequiredArgsConstructor
public class TelemetryServiceImpl implements TelemetryService {
    private final TelemetryRepository telemetryRepository;

    public void process(int id, TelemetryDto data) {
        telemetryRepository.save(Mapper.map(id, data));
    }

}
