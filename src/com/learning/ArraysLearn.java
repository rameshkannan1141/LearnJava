package com.learning;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;
import java.lang.String;

public class ArraysLearn {

    public static void main(String[] args) {

//        // array
//        int[] numbers = new int[20];
//        numbers[17] = 10;
//
//        System.out.println(numbers[17]);
//        System.out.println(Arrays.toString(numbers));
//
//
//        int a[] = new int[]{1,2,3,4,5,6};
//
//        char c[] = {'a','e','h'};
//
//        int len = a.length;
//        int a1[] = a.clone();
//
//
//
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(a1));
//
//        System.out.println(Arrays.toString(c));
//        System.out.println(a[4]);
//        System.out.println(len);


      ArrayEx.print();
      System.out.println("Minimum Number = "+ArrayEx.minNumber());
      System.out.println("Sum of Array = "+ArrayEx.sumOfArray());



    }
}

class ArrayEx{
    static int[] input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many values want add you? : ");
        int t = scan.nextInt();

        int[]  elements = new int[t];

        for(int i = 0 ; i < t ; i++){
            System.out.println("Enter adding Value : ");
            elements[i] = scan.nextInt();
        }

        return elements;

    }

    static void print(){
        System.out.println(Arrays.toString(input()));
    }

    static int minNumber(){
        int eleArray[] = input();
        int min=Integer.MAX_VALUE;
        for (int i = 0 ; i < eleArray.length ; i++){
            if (eleArray[i] < min){
                min = eleArray[i] ;

            }

        }
        return min;
    }

    static int sumOfArray() {
        int eleArray[] = input();
        int Sum = 0;
        for (int i = 0; i < eleArray.length; i++) {
            Sum += eleArray[i];

        }ArrayEx.sumOfArray();
        return Sum;
    }
}



