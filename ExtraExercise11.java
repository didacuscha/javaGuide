package com.mycompany.javaguide1;

import java.util.Scanner;

public class ExtraExercise11 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        
        int num1 = scanner.nextInt();
        int auxnum1 = num1;
        int digits = 0;
        
        while (num1 > 0){
            num1 /= 10;
            digits++;
        }
        
        System.out.println("el numero " + auxnum1 + " tiene " + digits + " digitos.");
    }
}