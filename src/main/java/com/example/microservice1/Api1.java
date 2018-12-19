package com.example.microservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "*")
@RestController
public class Api1 {

    @Autowired
    private Service1 service1;

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/devices")
    public List<Device> getDevices() {
        //return this.service1.getDevices();
        return this.service1.getDevicesFromDB();
    }

    @GetMapping("/devices/{id}")
    public Device getDevice(@PathVariable("id") Integer deviceId) {
        //return this.service1.getDevices();
        return this.service1.getDeviceById(deviceId);
    }

    @PostMapping(path = "/devices")
    public void createDevice(@RequestBody Device device) {
        this.service1.createDevice(device);
    }
}
