package com.github.uuidcde.composition;

import org.junit.Test;

public class VehicleTest {
    @Test
    public void test() {
        new Vehicle().setBody(new CarBody())
            .setEngine(new ElectricEngine())
            .run();

        new Vehicle().setBody(new TruckBody())
            .setEngine(new PetrolEngine())
            .run();
    }
}