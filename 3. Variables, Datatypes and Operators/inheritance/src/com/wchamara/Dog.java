package com.wchamara;

public class Dog extends Animals {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void walk() {
        System.out.println("walk method is called");
        super.move(5);
    }


    public void run() {
        System.out.println("run() is called");
//        if move is not found in the class it will look in the super class
        move(34);
    }

    private void chew() {
        System.out.println("chew method is called");
    }

    @Override
    public void eat() {
        System.out.println("eat() method is called");
        chew();
        super.eat();
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() is called");
        moveLegs(speed);
        super.move(speed);
    }

}
