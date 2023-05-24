package com.mycompany.javaguide1;
import java.util.Random;

public class ExtraExercise12 {
    
    public static void main(String[] args) {
        
        //int[][] matrix = new int[1000][3];

// fill the matrix
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    
                    if (i == 3 || j == 3 || k == 3) {
                        System.out.println((i == 3 ? "E" : i) + " " + (j == 3 ? "E" : j) + " " + (k == 3 ? "E" : k));
                    } else {
                        System.out.println(i + " " + j + " " + k);
                    }

                } 
            }

        }
        
        
     
        

        /* print the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println(); 
        }
        */
    }
}