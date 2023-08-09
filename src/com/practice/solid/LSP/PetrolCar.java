package com.practice.solid.LSP;

public class PetrolCar extends Vehicle{

    @Override
    public void addEnergy(){
        this.addPetrol();
    }
    public void addPetrol(){

    }
}
