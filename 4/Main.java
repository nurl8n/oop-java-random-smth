package com.company;

public class Main {
    public static void main(String[] args) {
        // конструктор по умолчанию
        Computer comp = new Computer(20);

        comp.setName("Linux");
        //comp.setRam(1024);
        comp.on();
        comp.load();
        comp.off();

    }
}

