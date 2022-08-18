package com.data;

import com.main.Engine;

public class IcEngine extends Engine {
    private int noOfCylinder;
    private String fuelType;

    public IcEngine(String modelNo, String displacement, String power, int maxRpm, int noOfCylinder, String fuelType) {
        super(modelNo, displacement, power, maxRpm);
        this.noOfCylinder = noOfCylinder;
        this.fuelType = fuelType;
    }

    public int getNoOfCylinder() {
        return noOfCylinder;
    }

    public void setNoOfCylinder(int noOfCylinder) {
        this.noOfCylinder = noOfCylinder;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
