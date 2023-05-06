package com.mycompany.javaguide1;
import java.util.Scanner;

public class Ejercicio13 {
public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int numba = scanner.nextInt();
    String asterisk = "*";
    String space = " ";
    
    for (int i = 1; i < numba; i++) {
        
        if (1 == i || numba == i) {
            String repeat = asterisk.repeat(numba);
            System.out.println(repeat);
        } else {
            String first = asterisk.repeat(1);
            String blanc = space.repeat(numba - 2);
            
            System.out.println(first + blanc + first);
        }
    }
    
    String repeat = asterisk.repeat(numba);
    System.out.println(repeat);
    
 }
}