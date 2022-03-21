package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
      int val1 = 12, val2 = 5;

        //addition
        System.out.println("Val1 + val2 = : " + (val1 + val2));
        System.out.println("val1 - val2: " + (val1 - val2));
        System.out.println("val1 * val2: " + (val1 * val2));
        System.out.println("val1 / val2: " + (val1 / val2));
        System.out.println("val1 % val2: " + (val1 % val2));



  //      rationalOperators();
   //     logicalOperators();
        percent();


    }

    static void rationalOperators(){
        int blueTeam = 20;
        int redTeam = 25;

        System.out.println(blueTeam == redTeam); //false

        System.out.println(blueTeam != redTeam); // true

        System.out.println(blueTeam > redTeam); // false

        System.out.println(blueTeam < redTeam); // true

        System.out.println(blueTeam >= redTeam); // false

        System.out.println(blueTeam <= redTeam); // true

    }


    static void logicalOperators() {
       //logical operators

        System.out.println("logical operators");
       //AND &&: returns true, if both sides are true
        System.out.println(12 > 6 && 6<= 10); //true

        // one side false, one side true
        System.out.println(12 < 6 && 6<= 10); //false

        //OR ||
        System.out.println("OR");
        System.out.println(12 < 6 || 6<= 10); //true
        System.out.println(12 > 6 || 6 > 10); //true
        System.out.println(12 < 6 || 6 > 10); //false

        //NOT !
        System.out.println("NOT");
        System.out.println(!(12 < 6 ));

    }


    static void percent() {
        int number = 100;
        System.out.println("25 pers of number: " + (number + number * 0.25));
    }

}
