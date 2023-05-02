package com.mycompany.javaguide1;

import java.util.Scanner;

/* Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
*/

public class exercise9{
    
public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int i = 0;
    int sum = 0;
    int numba = -1;
    
    while (i<20 && numba != 0) {
        System.out.println("Enter " + (i+1) + " number: ");
        i++;
        numba = input.nextInt();
        sum = sum + numba;
    }
    
    System.out.println("the sum of the 20 numbers entered is: " + sum);
  }
}