package com.company;


public class Vehicle {


    private int power;
    private double weight;
    private String name;

    public Vehicle(int power, double weight, String name)
    {
        this.power = power;
        this.weight =weight;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;

    }

    public void berechnePower() {
        System.out.println(+power + " kW und " + power * 1.36 + " PS");
    }

}



