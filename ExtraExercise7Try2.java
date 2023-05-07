package com.mycompany.javaguide1;
import java.util.Scanner;

public class ExtraExercise7Try2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = scanner.nextInt();
        int[] vector = new int[length];
        int i = 0;
        double maxVal = 0;
        double minVal = 100000;
        double average;
        double counter = 0;
        
        while (i < length) {
            System.out.println("Enter a number");
            int entry = scanner.nextInt();
            vector[i] = entry;
            counter += entry;
            i++;
            
            if (entry > maxVal){
                maxVal = entry;           
            }
            
            if (entry < minVal) {
                minVal = entry;
            }
            
        }
        
        average = counter / length;
        
        System.out.println("min value: " + minVal + " max value: " + maxVal + " average: " + average);
    }
}