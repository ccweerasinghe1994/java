package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int result = 1 + 2;
        System.out.println("1 + 2 is: " + result);

        int previousResult = result;

        result = result - 1;

        System.out.println(previousResult + " - 1 =  " + result);

        previousResult = result;

        result = result * 10;

        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 10;

        System.out.println(previousResult + " / 10 = " + result);

        previousResult = result;

        result = result % 3;

        System.out.println(previousResult + " % 10 = " + result);

        previousResult = result;

        result = result + 1;

        System.out.println(previousResult + " + 1 = " + result);

        previousResult = result;

        result++;

        System.out.println(previousResult + " + 1 = " + result);

        previousResult = result;

        result--;

        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result += 2;

        System.out.println(previousResult + " + 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
        }


    }
}
