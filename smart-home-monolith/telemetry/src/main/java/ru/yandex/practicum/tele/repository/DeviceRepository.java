package ru.yandex.practicum.tele.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yandex.practicum.tele.entity.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {
}
