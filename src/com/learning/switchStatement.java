package com.learning;
import java.util.Scanner;
import java.lang.String;


public class switchStatement {
    public static void main(String[] args) {
        // Switch statement

        String studentName ;

        Scanner input2 = new Scanner(System.in);
        studentName = input2.nextLine();

        switch (studentName) {
            case "Ramesh" :
                System.out.println("Hi  " + studentName);
                break;
            case "Kannan" :
                System.out.println("Hi  " + studentName);
                break;
            case "Kishore" :
                System.out.println("hi  " + studentName);
                break;
            default:
                System.out.println("Your name is not in list");

        }

    }
}
