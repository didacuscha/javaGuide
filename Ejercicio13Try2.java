package com.mycompany.javaguide1;

import java.util.Scanner;

public class Ejercicio13Try2{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int numba = scanner.nextInt();
        String asterisk = "*";
        String space = " ";

        String repeat = asterisk.repeat(numba);

        System.out.println(repeat); // print top row of asterisks

        for (int i = 2; i < numba; i++) { // start from i=2 to avoid printing top and bottom rows
            String first = asterisk.repeat(1);
            String blanc = space.repeat(numba - 2);

            System.out.println(first + blanc + first);
        }

        System.out.println(repeat); // print bottom row of asterisks

    }
}