package com.example.microservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class Service1 {

    @Autowired
    private DeviceRepository deviceRepository;

    public List<Device> getDevices() {
        return Arrays.asList(
                new Device(1, "111-111-111", "verifone", "Vx 820"),
                new Device(2, "222-222-222", "verifone", "Vx 820"),
                new Device(3, "333-333-333", "verifone", "Vx 820")
        );
    }

    public List<Device> getDevicesFromDB() {
        return this.deviceRepository.findAll();
    }

    public void createDevice(Device device) {
        this.deviceRepository.save(device);
    }

    public Device getDeviceById(Integer deviceId) {
        return this.deviceRepository.findById(deviceId).orElse(null);
    }
}
