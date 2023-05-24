package com.mycompany.javaguide1;

public class Ejercicio19 {
    
    public static void main(String[] args) {
    
    int[][] matrix = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        
        int sum = 0;
    
        for (int i = 0; i < matrix[0].length; i++){
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
                
                if (matrix[j][i] != -matrix[i][j] ) {
              
                } else {
                    sum++;
                }
            
            
            }  
            System.out.println();
            }
        
        if (sum == (matrix.length * matrix[0].length)) {
                System.out.println("Sucess, anti-simetric matrix found");
        } else {
            System.out.println("SORRY, Anti-simmetric matrix NOT found.");
        }
    }
}