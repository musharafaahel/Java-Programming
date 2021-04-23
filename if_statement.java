package com.company;

public class if_statement {
    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not alien");
            System.out.println("And I am scared of aliens");
        }

        int topscore = 100;
        if(topscore > 100){
            System.out.println("You got the high score!");
        }
        int secondtopscore = 60;
        if (topscore > secondtopscore && topscore<100){
            System.out.println("Greater than second top score and less than 100");
        }

        /* Logical operators
            ==
            !=
            >
            <
            >=
            <=
         */
    }
}
