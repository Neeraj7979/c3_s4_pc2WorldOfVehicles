package com.main;

public class Engine {
    private String modelNo;
    private String displacement;
    private String power;
    private int maxRpm;

    public Engine(String modelNo, String displacement, String power, int maxRpm) {
        this.modelNo = modelNo;
        this.displacement = displacement;
        this.power = power;
        this.maxRpm = maxRpm;

    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getMaxRpm() {
        return maxRpm;
    }

    public void setMaxRpm(int maxRpm) {
        this.maxRpm = maxRpm;
    }

    public void display(){
        System.out.println("modelNo = " + modelNo);
        System.out.println("displacement = " + displacement);
        System.out.println("power = " + power);
        System.out.println("maxRpm = " + maxRpm);
    }
}
