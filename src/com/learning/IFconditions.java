package com.learning;
import java.util.Scanner;
import java.lang.String;
public class IFconditions {
    public static void main(String[] args) {


        // if condition
        int pen = 10 ;
        int HeroPen = 50 ;
        int ParkerPen = 100 ;
        int cost ;

        Scanner input1 = new Scanner(System.in);
        cost = input1.nextInt();

        if (cost >= ParkerPen) {
            System.out.println(" You can bye the ParkerPen");
        }
        else if (cost >= HeroPen ) {
            System.out.println(" You can bye the HeroPen");
        }
        else if (cost >= pen){
            System.out.println("You can bye the pen ");
        }
        else {
            System.out.println("You have less money to buy the pen");
        }

    }
}
