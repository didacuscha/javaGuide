package com.mycompany.javaguide1;

import java.util.Random;
import java.util.Scanner;
public class ExtraExercise10 {
    
    public static void main(String[] args){
        
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);
        int mult = num1 * num2;
        int guess = 0;
        
        
        do {
            System.out.println("Ingrese un numero aleatorio entre 0 y 100: ");
            guess = scanner.nextInt();
            
        } while (guess != mult); 
            
        if (guess == mult){
              System.out.println("Felicitaciones has encontrado el numero aleatorio!");               
        }
    }
}