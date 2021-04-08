package com.company;

public class Main {

    public static void main(String[] args) {
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;
        boolean isCustomerOverTwentyOne = true;
        char myCopyrightChar = '\u00A9';

        System.out.println(myCopyrightChar);

        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myTrueBoolean);
        System.out.println(myFalseBoolean);
        System.out.println(isCustomerOverTwentyOne);

        long myCharMinValue = Character.MIN_VALUE;
        long myCharMaxValue = Character.MAX_VALUE;
        System.out.println("Char Minimum Value = "+ myCharMinValue);
        System.out.println("Char Maximum Value = "+ myCharMaxValue);



    }
}
