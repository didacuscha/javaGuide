package com.mycompany.javaguide1;
import java.util.Scanner;

public class ExtraExercise18 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la longitud del vector: ");
        int longitud = scanner.nextInt();
        int total = 0;
        int[] vector = new int[longitud];
        
        for (int i = 0; i < longitud; i++) {
            System.out.println("Ingrese el valor " + (i + 1));
            int num = scanner.nextInt();
            vector[i] = num;
            total += num;
        }
        System.out.println("La suma total es: " + total);
    }
}