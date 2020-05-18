package com.company;

import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 13;
//	for floats after entering the the number the proper practice is to add "f"
//        this is called single precision
//        with of 32bits(4 bytes)
        float myFloatValue = 23f;
//	 for conversion casting can be used
        float var = (float) 23;
//	for double after entering the the number the proper practice is to add "d" but java default take as double
//        this is called double precision
//        with of 64bits(8 bytes)
        double myDoubleValue = 34;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

//        lets take the precision
        System.out.println("int = " + myIntValue / 2);
        System.out.println("float = " + myFloatValue / (float) 3);
        System.out.println("double = " + myDoubleValue / (double) 3);

//        output
//        int = 6
//        float = 7.6666665
//        double = 11.333333333333334

        double poundValue = 3;
        double kiloGramValue = poundValue*0.45359236;
        System.out.println("kiloGramValue = " +kiloGramValue+"kg.");
    }
}
