package com.learning;
import java.lang.String;

public class javaOperators {
    public static void main(String[] args) {
        // constant
        final int myAge = 19;

        // java operator procedence

        byte numOne = 10 ;
        byte numTwo = 20 ;

        int numthree = numOne + numTwo;

        numTwo += 30 ;

        System.out.println(numthree);


        System.out.println(numTwo);

        System.out.println(numOne < numTwo);

        System.out.println(numOne == numTwo);

        System.out.println(numOne != numTwo);

        // BODMAS
        /*
        Brackets ()
        Order Power Of root , squard
        Divide 
        Multiply
        Addition
        Subraction
        
         */
        int num5 = 1*2+3%6*7/8 ;
        System.out.println(num5);

        // logicl operators & , | , !

        int ageOfPerson = 20 ;
        boolean indianCitizen = true;

        System.out.println(ageOfPerson >= 18 && indianCitizen == true  );
        System.out.println(ageOfPerson >= 18 || indianCitizen == true  );

        System.out.println(! indianCitizen == true  );

        // ternary  operator
      //  String ageCondition = ageOfPerson >= 18 ? "eligible" : "not eligible" ;
       // System.out.println(ageCondition); // or


        System.out.println(ageOfPerson >= 18 ? "eligible" : "not eligible");

        // increment decrement operator

        int N = 10 ;
        N ++ ;
        --N ;

        System.out.println(N);

        System.out.println(--N);
        System.out.println(N++);

        int N2 = ++ N ;

        System.out.println(N2);

        // Matah class

        int Num = 100;
        int Num2 = 101;

        System.out.println( Math.max(Num,Num2));
        System.out.println( Math.min(Num,Num2));

        System.out.println( Math.log(Num));

    }
}
