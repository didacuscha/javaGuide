package com.mycompany.javaguide1;

import java.util.Scanner;

public class ExtraExercise19{
    
    public static void main(String[] args){
        
        int[] vectora = {1, 15, 420, 69, 75};
        int[] vectorb = {1, 15, 420, 69, 75};
        boolean equals = true;
        
        if (vectora.length == vectorb.length) {
           for (int i = 0; i < vectora.length; i++) {
            
            if (vectora[i] == vectorb[i]){
                
            } else {
                equals = false;
                System.out.println("Vectors aren't the same.");
                break;
            }       
            } if (!(equals == false)) {
                System.out.println("Both vectors are equal");
            }  
           
        } else {               
                System.out.println("Please enter two vectors with same length.");
        
        } 
        
    }
}