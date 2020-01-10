package com.company;

public class Main {

    public static void main(String[] args) {
//	Int
//        has width of 32
        int myValue = 10000;

//	max value that can be store in a integer is -2.17 billion to 2.17 billion
        int smallestNumber = -2_147_483_648; // this is called literals if (a*b) this is called a expression
        int maximumNumber = 2_147_483_647;

//        Bytes
//        has width of 8
        byte minByteValue = -128;
        byte maxByteValue = 127;


//        Short
// has width of 16
        short minShortValue = 32767;
        short maxShortValue = -32768;

//        long
//        has a width of 64
        long myLongValue = 1_238_232_999_122_121_121L;

//    when doing arithmetic operation remember java default uses a integer
//    therefor we have to use casting to prevent java from giving an error

        byte newValue = (byte)(minByteValue/2);

        long longTotal = 1000000000000L +10L*(myValue+maxByteValue+maxShortValue);
        short shortTotal = (short)(100+10*(myValue+maxByteValue+maxShortValue));

    }


}
