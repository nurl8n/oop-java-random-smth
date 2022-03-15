package com.company;

// class -> Computer
public class Computer {
    // характеристики / поля
    public String name;
    public int ram;
    public int hdd;
    public double weight;

    // действия void ничего не возвращает, и в скобки что возвращает
    // если действия ничего не выполняют -> заглушки
    public void on() {
        System.out.println("Computer is On. My name is " + name);
    }

    public void off() {
        System.out.println("Computer is Off");
    }

    public void load() {
        System.out.println("Computer has Loaded Some Data. Data Storage: " + hdd + " GB");
    }
}

