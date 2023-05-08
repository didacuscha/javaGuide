package com.mycompany.javaguide1;
import java.util.Scanner;

public class ExtraExercise16 {
    
    public static int function(int cantidad){
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Ingrese el nombre de la persona " + i);
            String name = scanner.next();
            System.out.println("Ingrese la edad de " + name);
            int age = scanner.nextInt();
            
            if (age > 18) {
                System.out.println(name + " es mayor de edad");
            } else {
                System.out.println(name + " es menor de edad");
            }
            
            System.out.println("Quiere continuar? (S/N)");
            String continuar = scanner.next();
            
            if (continuar.equalsIgnoreCase("n")){
                System.out.println("Fin del programa");
                break;
            } else if (continuar.equalsIgnoreCase("s"))
                System.out.println("ok, continuamos");
            else {
                System.out.println("Porfavor ingresa S para continuar o N para parar en la proxima iteracion.");
            }
        }
        
        return cantidad;
    }
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int cantidad = scanner.nextInt();
        
        function(cantidad);
    }
}