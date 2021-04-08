package com.company;

public class Strings {
    public static void main(String[] args) {
        //8 Datatypes primitive
        //byte, short, int, long
        //float, double
        //char, boolean
        //String datatpe not primitive type but it's actually a class

        String myString = "This is my string";
        System.out.println("My string = "+myString);
        myString = myString + ", and this is more";
        System.out.println("My string = "+myString);
        myString = myString + " \u00A9 2019";
        System.out.println("My string = "+myString);
        String myNumberString = "255.95";
        myNumberString = myNumberString + "49.55";
        System.out.println(myNumberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
    }
}
