package com.mycompany.javaguide1;

import java.util.Scanner;

public class ExtraExercise9 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        int auxnum1 = num1;
        int auxnum2 = num2;
        int restas = 0;
        
        
        while (num1 > num2){
            num1 -= num2;
            restas++;
        }
        
        
        System.out.println("se dividio " + auxnum1 + " entre " + auxnum2);
        System.out.println("El cociente es: " + restas + " y el residuo " + num1);
    }
}