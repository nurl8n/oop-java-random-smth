package com.company;

public class Computer {
    private String name;
    private int ram;
    private int hdd;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int newRam) {
        if (newRam > 0) {
            ram = newRam;
        }else{
            System.out.println("It is wrong, man");
        }
    }

    public void on() {
        System.out.println("Computer is On. My name is " + name);
    }

    public void off() {
        System.out.println("Computer is Off");
    }

    public void load() {
        System.out.println("Computer has Loaded Some Data. Data Storage: " + ram + " GB");
    }
}

