package com.mycompany.javaguide1;
import java.util.Scanner;

public class Ejercicio12 {
public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    int cadenasOk = 0;
    int cadenasNotOk = 0;
    
    System.out.println("""
                       Bienvenido al dispositivo RS232, ingrese cadenas con el siguiente formato: 
                       - Maximo 5 caracteres de largo 
                       - Primer caracter tiene que ser X 
                       - Ultimo caracter debe ser O 
                       Para finalizar ingresa &&&&&""");
    
    String chain; 
    
    while (!(chain = input.nextLine()).equals("&&&&&")) {
        
        if (chain.length() <= 5 && chain.indexOf("X") == 0 && chain.indexOf("O") == chain.length() - 1) {
            cadenasOk++;            
        } else {
            cadenasNotOk++;
        }    
    }
    
    System.out.println("\nCadenas con formato apropiado: " + cadenasOk + "\nCadenas con formato incorrecto: " + cadenasNotOk + " \nProgram finished.");
 }
}