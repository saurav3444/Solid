package com.practice.solid.LSP;

public class ElectricCar extends Vehicle{

    public void addEnergy(){
        this.rechargeBattery();
    }

    private void rechargeBattery() {
        //impl
    }
}
