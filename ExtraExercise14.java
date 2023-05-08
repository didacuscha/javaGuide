package com.mycompany.javaguide1;
import java.util.Scanner;

public class ExtraExercise14 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias: ");
        int families = scanner.nextInt();
        int children = 0;
        int totalChildren = 0;
        int average = 0;
        
        for (int i = 1; i <= families; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia " + i);
            children = scanner.nextInt();
            totalChildren += children;
        }
            
        average = totalChildren / families;
        System.out.println("el promedio de hijos es de: " + average + " por familia");
    }
}