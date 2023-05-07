package com.mycompany.javaguide1;
import java.util.Scanner;
import java.util.Random;

//This exercise is corrupted, for the response look at exercise7try2.java
//This program asks for an input to set the length of an array 
//and prints random numbers from 1 to 100 according to that length

public class ExtraExercise7 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int longitud = scanner.nextInt();
        
        int[] vector = new int[longitud];
        
        for (int i = 0; i < longitud; i++) {
        int randomNum = (int)(Math.random() * 100) + 1;    
        vector[i] = randomNum;
        System.out.println(vector[i]);
        }
    }
}