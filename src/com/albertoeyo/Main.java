package com.albertoeyo;

public class Main {

    public static void main(String[] args) {
        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create an int variable and set it to any valid int number.
        // 4. Create a variable of type long, and make it equal to 5000 + 10
        //    times the sum of the byte, plus the short plus the int

        byte myByte = 12;
        short myShort = 10;
        int myInt = 150;
        long myLong = 5000L + 10L * (myByte + myShort + myInt);

        System.out.println("longTotal = " + myLong);

    }
}
