package ru.yandex.practicum.tele.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.tele.dto.DeviceDto;
import ru.yandex.practicum.tele.dto.TelemetryDto;
import ru.yandex.practicum.tele.service.DeviceService;
import ru.yandex.practicum.tele.service.TelemetryService;

@RestController
@RequestMapping("/devices")
@RequiredArgsConstructor
public class TelemetryController {

    private final TelemetryService telemetryService;
    private final DeviceService deviceService;

    private static final Logger logger = LoggerFactory.getLogger(TelemetryController.class);

    @PostMapping("/{device_id}/telemetry/latest")
    @ResponseStatus(HttpStatus.CREATED)
    public void logTelemetry(@PathVariable("device_id") Integer id, RequestEntity<TelemetryDto> req) {
        logger.info("Сохранение данных от прибора с id {}", id);
        telemetryService.process(id, req.getBody());
    }

    @PostMapping("/{device_id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void setDevice(@PathVariable("device_id") Integer id, RequestEntity<DeviceDto> req) {
        logger.info("Сохранение в справочник прибора с id {}", id);
        deviceService.process(id, req.getBody());
    }

}
