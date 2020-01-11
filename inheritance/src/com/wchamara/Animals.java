package com.wchamara;

public class Animals {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animals(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {

    }

    public void move(int speed) {
        System.out.println("Animal() move is called");
        System.out.println("Animal is moving at " + speed);
    }

//    getters

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
