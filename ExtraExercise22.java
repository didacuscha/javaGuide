package com.mycompany.javaguide1;
import java.util.Scanner;
import java.util.Random;

public class ExtraExercise22 {
    
    public static void main(String[] args){
        
        Random random = new Random();
        int suma = 0;
        int rows = 4;
        int columns = 5;
        int[][] matrix = new int[rows][columns];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int randomNum = random.nextInt(100) + 1;
                suma += randomNum;
                matrix[i][j] = randomNum;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("suma: " + suma);
        }
    
}
