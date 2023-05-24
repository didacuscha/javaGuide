package com.mycompany.javaguide1;
import java.util.Scanner;

public class Ejercicio20{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int[][] matrix = new int[3][3];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println("Ingrese un numero entero para la matriz 3x3 ");
                matrix[i][j] = scanner.nextInt();
                
            }
        }
        int firstCol = 0;
        int secondCol = 0;
        int thirdCol = 0;
        int firstRow = 0;
        int secondRow = 0;
        int thirdRow = 0;
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                
                if (i == 0) {
                    firstCol += matrix[i][j];
                }
                
                if (i == 1){
                    secondCol += matrix[i][j];
                } 
                
                if (i == 2) {
                    thirdCol += matrix[i][j];
                }
            }

        }
        
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                
                if (i == 0) {
                    firstRow += matrix[j][i];
                }
                
                if (i == 1){
                    secondRow += matrix[j][i];
                } 
                
                if (i == 2) {
                    thirdRow += matrix[j][i];
                }
            }

        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                firstDiagonal += matrix[i][i];
            }
        }
        
        for (int i = 2; i > -1; i--) {
            for (int j = 0; j < matrix.length; j++) {
                secondDiagonal += matrix[i][i];
            }
        }
        
        /*System.out.println(firstCol + " " + secondCol + " " + thirdCol);
        System.out.println(firstRow + " " + secondRow + " " + thirdRow);
        System.out.println(firstDiagonal /3);
        System.out.println(secondDiagonal /3);
        */
        
        if (firstCol == secondCol && firstCol == thirdCol && firstCol == thirdCol && firstCol == firstRow && firstCol == secondRow && firstCol == thirdRow && firstCol == (firstDiagonal /3) && firstCol == ( secondDiagonal / 3)){
            System.out.println("MAGIC Square found");
        } else {
            System.out.println("SORRY, Magic Square NOT found");
        }
    }
}
        
    
