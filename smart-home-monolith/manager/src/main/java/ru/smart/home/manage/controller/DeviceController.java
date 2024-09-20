package ru.smart.home.manage.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;
import ru.smart.home.manage.dto.DeviceDto;
import ru.smart.home.manage.service.DeviceService;

@RestController
@RequestMapping("/devices")
@RequiredArgsConstructor
public class DeviceController {

    private final DeviceService deviceService;

    private static final Logger logger = LoggerFactory.getLogger(DeviceController.class);

    /*@GetMapping("/{device_id}/telemetry/latest")
    public ResponseEntity<HeatingSystemDto> getHeatingSystem(@PathVariable("id") Long id) {
        logger.info("Fetching heating system with id {}", id);
        return ResponseEntity.ok(heatingSystemService.getHeatingSystem(id));
    }*/

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void setDevice(RequestEntity<DeviceDto> req) {
        logger.info("Сохранение прибора в справочник ");
        deviceService.save(req.getBody());
    }

}
