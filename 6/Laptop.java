package com.company;

public class Laptop extends Computer {
    public Laptop() {
        System.out.println("NITRO 5");
    }

    @Override
    public void on() {
        print("HELLO WORLD " + getName());
    }

}
