package com.mycompany.javaguide1;
import java.util.Random;

public class Ejercicio18 {
    
    public static void main(String[] args){
        Random rand = new Random();
        
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rand.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            } 
            System.out.println();
        }
        
        System.out.println("---------------------------");
        
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");
            } 
            System.out.println();
        }
    }
}