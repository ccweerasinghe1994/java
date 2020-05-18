package com.wchamara;

//public access modifier means Car has unrestricted access
//class is a blueprint that can be used to create objects
public class Car {
    //private can only be accessed inside the class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //buy using a setter we where able to validate the data that can be pass to the object
//    also it enables the encapsulation by not allowing other classes to directly access the class
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return model;
    }
}
