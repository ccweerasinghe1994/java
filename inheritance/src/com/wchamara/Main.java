package com.wchamara;

public class Main {

    public static void main(String[] args) {
        Animals animals = new Animals("animal", 1, 1, 12, 23);
        Fish fish = new Fish("gold", 23, 2, 1, 2, 3);
        fish.move(23);

        Dog dog = new Dog("dog", 1, 2, 2, 4, 1, 34, "fur");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
