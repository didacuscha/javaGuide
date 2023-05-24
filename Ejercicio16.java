package com.mycompany.javaguide1;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Ingrese el tamanio del arreglo: ");
        int largo = scanner.nextInt();
        
        int[] vector = new int[largo];
        
        System.out.println("Ingrese el numero a buscar en el arreglo: ");
        int look = scanner.nextInt();
        int times = 0;
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100);
            if (vector[i] == look){
                times++;
                System.out.println("El numero " + look + " se encuentra en la posicion " + (i + 1));
            } 
                
            } 
            
            System.out.println("El numero " + look + " se ubico " + times + " veces en el vector");
        }
        
}
