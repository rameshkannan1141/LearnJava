package com.learning;
import java.lang.String;


public class String_Learn {
    public static void main(String[] args) {
        // String
        String myName = "  I am rameshkannan" ;
        String myAge = " age 19";

        System.out.println(myName);
        System.out.println(myName.toUpperCase());
        System.out.println(myName.toLowerCase());
        System.out.println(myName.concat(myAge));
        System.out.println(myName.trim().replace(" ","_"));
        System.out.println(myName.trim());

        /* naming convection
        PascalNamingConvection
        camelNamingConvection
         */
    }
}
