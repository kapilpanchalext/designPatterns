package com.java.builderpattern;

import com.java.builderpattern.factory.Vehicle;
import com.java.builderpattern.factory.VehicleFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        log.info("Builder Design Pattern");
        
        Vehicle vehicle = VehicleFactory.getVehicle("bike");
        vehicle.drive();
    }
}
