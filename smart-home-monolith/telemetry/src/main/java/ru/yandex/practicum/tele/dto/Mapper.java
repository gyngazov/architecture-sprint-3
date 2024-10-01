package ru.yandex.practicum.tele.dto;

import ru.yandex.practicum.tele.entity.Device;
import ru.yandex.practicum.tele.entity.Telemetry;

public class Mapper {
    public static Telemetry map(int deviceId, TelemetryDto dto) {
        Telemetry t = new Telemetry();
        t.setDeviceId(deviceId);
        t.setTemperature(dto.getTemperature());
        t.setStream(dto.getStream());
        return t;
    }

    public static Device map(int deviceId, DeviceDto dto) {
        Device d = new Device();
        d.setId(deviceId);
        d.setTypeId(dto.getTypeId());
        d.setHouseId(dto.getHouseId());
        d.setModulesId(dto.getModulesId());
        d.setSerialNumber(dto.getSerialNumber());
        d.setName(dto.getName());
        return d;
    }
}
