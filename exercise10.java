package com.mycompany.javaguide1;

import java.util.Scanner;

public class exercise10{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
                
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter " + (i+1) + " number, pd: we only accept numbers from 1 to 20");
            int numba = input.nextInt();
            
            for (int j = 0; j < 1; j++) {
                String asterisks = "*";
                String result = asterisks.repeat(numba);
                System.out.println(numba + " " + result);
            } 
        }
        /*
        int numa = 5;
        
        for (int i = 0; i < 1; i++) {
            String asterisks = "*";
            String result = asterisks.repeat(numa);
            System.out.println(numa + " " + result);
            
        }
        */
    }
}