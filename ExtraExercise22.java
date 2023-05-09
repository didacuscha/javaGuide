package com.mycompany.javaguide1;
import java.util.Scanner;
import java.util.Random;

public class ExtraExercise22 {
    
    public static void main(String[] args){
        
        Random random = new Random();
        double suma = 0;
        int rows = 4;
        int columns = 5;
        double[][] matrix = new double[rows][columns];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                double randomNum = random.nextInt(100) + 1;
                suma += randomNum;
                matrix[i][i] = randomNum;
                System.out.println(matrix[i][j]);
            }
        }
        System.out.println("suma: " + suma);
        }
    
}
