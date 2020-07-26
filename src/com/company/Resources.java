package com.company;

public class Resources {
    protected String command = "Remaining";

    private Integer resourcesWater  = 400;
    private Integer resourcesMilk   = 540;
    private Integer resourcesCoffee = 120;
    private Integer resourcesMoney  = 550;
    private Integer resourcesCups   = 9;

    public Integer getResourcesWater() {
        return resourcesWater;
    }

    public Integer getResourcesMilk() {
        return resourcesMilk;
    }

    public Integer getResourcesCoffee() {
        return resourcesCoffee;
    }

    public Integer getResourcesMoney() {
        return resourcesMoney;
    }

    public Integer getResourcesCups() {
        return resourcesCups;
    }

    public void setResourcesWater(Integer resourcesWater) {
        this.resourcesWater = resourcesWater;
    }

    public void setResourcesMilk(Integer resourcesMilk) {
        this.resourcesMilk = resourcesMilk;
    }

    public void setResourcesCoffee(Integer resourcesCoffee) {
        this.resourcesCoffee = resourcesCoffee;
    }

    public void setResourcesMoney(Integer resourcesMoney) {
        this.resourcesMoney = resourcesMoney;
    }

    public void setResourcesCups(Integer resourcesCups) {
        this.resourcesCups = resourcesCups;
    }
}
