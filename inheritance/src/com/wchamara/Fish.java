package com.wchamara;

public class Fish extends Animals {
    private int gills;
    private int eye;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eye, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eye = eye;
        this.fins = fins;
    }
    private void rest (){

    }
    private void moveMuscle (){

    }
    private void moveBackFin (){

    }
    public void swim (){
moveMuscle();
moveBackFin();
super.move(23);
    }

}
