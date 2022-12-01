package com.learning;
import java.util.Scanner;
import java.util.Locale;
import java.lang.String;

public class inputMETHODS {
    public static void main(String[] args) {
        // user input

//      String yourName ;
//        int yourAge ;
//
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println(" Your Name ");
//        yourName = input.nextLine();
//        System.out.println(" Welcome, Mr."+yourName.toUpperCase(Locale.ROOT));
//
//
//        System.out.println("Your Age ");
//        yourAge = input.nextInt();
//        System.out.println("AGE "+yourAge);
      System.out.println(countX("gfgfxxxx"));

    }
  public static int countX(String str) {
      if(str.isEmpty()){
        return 0;

      }
      str=str.toLowerCase();
      if (str.charAt(str.length()-1)=='x'){
        return 1+countX(str.substring(0,str.length()-1));
      }

    return countX(str.substring(0,str.length()-1));

  }
}
