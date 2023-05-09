package com.mycompany.javaguide1;
import java.util.Scanner;

public class ExtraExercise21 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        double[] alumnos = new double[3];
        double average = 0;
        int passed = 0;
        int failed = 0;
        for (int i = 0; i < alumnos.length; i++) {
            
            System.out.println("Estudiante " + (i + 1));
            System.out.println("Ingresa la nota del primer trabajo practico evaluativo (10%): ");
            double primer = scanner.nextDouble();
            System.out.println("Ingresa la segunda del segundo trabajo practico evaluativo (15%): ");
            double second = scanner.nextDouble();
            System.out.println("Ingresa la nota del primer Integrador (25%): ");
            double third = scanner.nextDouble();
            System.out.println("Ingresa la nota del segundo Integrador (50%): ");
            double fourth = scanner.nextDouble();
            
            average = ((primer * 0.1) + (second * 0.15) + (third * 0.25) + (fourth * 0.5));
            
            if (average >= 7) {
                System.out.println("El estudiante " + i + " paso con: " + average );
                passed++;
            } else {
                System.out.println("El estudiante " + i + " perdio con: " + average );
                failed++;
            }
 
        }
        
        System.out.println("La cantidad de aprobados es: " + passed + "\nLa cantidad de reprobados es: " + failed);
    }
}