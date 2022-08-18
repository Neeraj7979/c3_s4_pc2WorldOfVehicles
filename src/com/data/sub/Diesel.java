package com.data.sub;

import com.data.IcEngine;

public class Diesel extends IcEngine {
    public Diesel(String modelNo, String displacement, String power, int maxRpm, int noOfCylinder, String fuelType) {
        super(modelNo, displacement, power, maxRpm, noOfCylinder, fuelType);
    }
}
