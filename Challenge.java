package com.company;

public class Challenge {
    public static void main(String[] args) {
        byte b = 2;
        short s = 127;
        int i = 500;
        long l = (50000L + 10L*(b + s + i));
        short sl =(short) (50000L + 10L*(b + s + i));
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(sl);
    }
}
