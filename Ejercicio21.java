package com.mycompany.javaguide1;

public class Ejercicio21{
    
    public static void main(String[] args){
        
        int[][] matrix1 = {
            {1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61}, 
            {56, 78, 87, 90, 9, 90, 17, 12, 87, 67}, 
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35}, 
            {32, 76, 79, 1, 36, 5, 67, 96, 12, 11}, 
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76}, 
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78}, 
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18}, 
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24}, 
            {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}
        };
        
        int[][] subMatrix = {
            {36, 5, 67}, 
            {89, 90, 75}, 
            {14, 22, 26}
        };
        
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] == subMatrix[0][0]){
                   if (matrix1[i][j] == subMatrix[0][1]){
                    if (matrix1[i][j] == subMatrix[0][2]){
                      if (matrix1[i][j] == subMatrix[1][0]){
                        if (matrix1[i][j] == subMatrix[1][1]){
                           if (matrix1[i][j] == subMatrix[1][2]){
                              if (matrix1[i][j] == subMatrix[2][0]){
                                 if (matrix1[i][j] == subMatrix[2][1]){
                                    if (matrix1[i][j] == subMatrix[2][2]){
                                        System.out.println("SubMatrix found in the 10x10 Matrix");
                                    }
                                 }
                               }
                            }
                        }
                     }
                    }
                   } 
                }
            }
            
        }
                
                          
    }
}