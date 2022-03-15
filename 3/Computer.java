package com.company;

public class Computer {
    private String name;
    private int ram;
    private int hdd;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram > 0) {
            this.ram = ram;
        }else{
            System.out.println("It is wrong, man");
        }
    }

    public void on() {
        print("Computer is On. My name is " + getName());
    }

    public void off() {
        print("Computer is Off");
    }

    public void load() {
        print("Computer has Loaded Some Data. Data Storage: " + getRam() + " GB");
    }

    private void print(String str) {
        System.out.println(str);
    }
}

