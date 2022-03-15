package com.company;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.name = "Linux";
        comp.hdd = 1024;
        comp.on();
        comp.load();
        comp.off();

    }
}

