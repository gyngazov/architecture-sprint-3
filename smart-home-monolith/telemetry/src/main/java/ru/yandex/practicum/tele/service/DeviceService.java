package ru.yandex.practicum.tele.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.yandex.practicum.tele.dto.DeviceDto;
import ru.yandex.practicum.tele.dto.Mapper;
import ru.yandex.practicum.tele.repository.DeviceRepository;

@Service
@RequiredArgsConstructor
public class DeviceService {
    private final DeviceRepository deviceRepository;

    public void process(int id, DeviceDto data) {
        deviceRepository.save(Mapper.map(id, data));
    }

}
