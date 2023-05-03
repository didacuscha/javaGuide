package com.mycompany.javaguide1;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        
        
        System.out.println("Hi, You'd be asked numbers until you reach the 420 limit.");
        Scanner input = new Scanner(System.in);
        int limit = 0;
        
        while (limit < 420) {
            System.out.println("Enter an integer to add: ");
            int numba = input.nextInt();
            limit = limit + numba;
                    
        }
        
        System.out.println("You've reached the limit with: " + limit);
    }
}