package com.mycompany.javaguide1;

import java.util.Scanner;


public class ExtraExercise8 {
    
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    int length = 1;
    int[] vector = new int[length];
    int i = 0;
    int num;
    int odds = 0;
    int evens = 0;
    
    
    do {
        vector = new int[length++];
        System.out.println("enter a number ");
        num = scanner.nextInt();
        vector[i] =  num;
        i++;
        
        
        if (num % 2 == 0) {
            odds++;
        }
        
        if (num % 2 != 0) {
            evens++;
        }
        
    } while (num % 5 != 0);
    
        System.out.println(i + " read numbers, " + odds + " odd numbers, and " + evens + " even numbers");
 }
}    