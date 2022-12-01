package com.learning;
import java.lang.String;

public class loops {
    public static void main(String[] args) {





// loops
        // for loop , while, do while, for-each loop.

        for (int initial = 0 ; initial < 3 ; initial ++) {
            System.out.println("for");

        }




        int value = 2 ;

        while ( value > 0) {
            System.out.println("while");
            value --;
        }




        int value2 = 3 ;

        do {
            System.out.println("do while");
            value2 --;
        } while (value2 > 0) ;



        // for-each arrays

        String veg[] = {"onion" , "carrot" , "beans"} ;
        for (int i = veg.length-1; i> 0 ; i-- ) {
            System.out.println(veg[i]);
        }
        for (String veg2 : veg) {  // reverse print not working
            System.out.println(veg2);
        }





    }
}
