package com.mycompany.javaguide1;
import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa un primer numero entero: ");
        int numa = input.nextInt();
        System.out.println("ingresa un segundo numero entero: ");
        int numb = input.nextInt();
        
        int entry = 0;
        
        while (entry != 5) {
            System.out.println("------------ \nMENU \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Salir \nElija opción: ");
            entry = input.nextInt();
            
            switch (entry) {
                case 1 -> {
                    int sum = numa + numb;
                    System.out.println("The sum is: " + sum);
                }
                case 2 -> {
                    int rest = numa - numb;
                    System.out.println("The substraction is: " + rest);
                }
                case 3 -> {
                    int mult = numa * numb;
                    System.out.println("The multiplication is: " + mult);
                }
                case 4 -> {
                    int div = numa / numb;
                    System.out.println("The division is " + div);
                }
                case 5 -> {
                    System.out.println("Are you sure you want to exit? (Y, N)");
                    String answer = input.next();
                    if (answer.equalsIgnoreCase("y")){                       
                        entry = 5;
                    } else {
                        entry = 0; 
                    }
                }
            }
        }
        
        System.out.println("Program finished.");
        
    }
}
