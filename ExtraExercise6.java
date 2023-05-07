package com.mycompany.javaguide1;

import java.util.Scanner;

public class ExtraExercise6 {
    
    public static void main(String[] args) {
        
        //Scanner scanner = new Scanner(System.in);
        
        int[] height = {170, 155, 148, 185, 196, 166, 130, 176, 182, 189, 190};
        int people = 0;
        int shorties = 0;
        int sumShorties = 0;
        int totalHeights = 0;
        int averageShorties;
        int averageHeights;
        
        for (int i = 0; i < height.length; i++) {
            totalHeights += height[i];
            people ++;
            
            if (height[i] < 160) {
                sumShorties += height[i];
                shorties ++;           
        }            
        } 
        averageShorties = sumShorties / shorties;
        averageHeights = totalHeights / people;
        System.out.println("average for shorties is: " + averageShorties + " and average for all is: " + averageHeights);
    }
}