package com.learning;
import java.lang.String;
import java.util.Scanner;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        int count = 0;
        int tempCount = 0;

        while (n>0){
            int remainder = n%2;
            n=n/2;                       // these two codes are used.........decimal to binary covertion factor

            if(remainder ==1){
                tempCount++;
                if(tempCount>count){   // these code used........... greater than value
                    count = tempCount;
                }
            }else{
                tempCount = 0;
            }

        }

       System.out.println(count);


    }

    }






