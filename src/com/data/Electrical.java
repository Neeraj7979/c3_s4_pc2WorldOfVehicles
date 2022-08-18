package com.data;

import com.main.Engine;

public class Electrical extends Engine {
    private String voltage;
    private String motorType;

    public Electrical(String modelNo,String displacement,String power,int maxRpm,String voltage,String motorType){
        super(modelNo,displacement,power,maxRpm);
        this.voltage=voltage;
        this.motorType=motorType;

    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }
}
