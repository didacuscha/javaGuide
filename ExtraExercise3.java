package com.mycompany.javaguide1;

import java.util.Scanner;

public class ExtraExercise3 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una letra para decirte si es vocal o no.");
        String letra = scanner.next();
        
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println(letra + " es vocal");
        } else if (letra.equals("b") || letra.equals("c") || letra.equals("d") || letra.equals("f") || letra.equals("g") || letra.equals("h") || letra.equals("j") || letra.equals("k") || letra.equals("l") || letra.equals("m") || letra.equals("n") || letra.equals("p") || letra.equals("q") || letra.equals("r") || letra.equals("s") || letra.equals("t") || letra.equals("x") || letra.equals("w") || letra.equals("y") || letra.equals("z") ) {
            System.out.println(letra + " no es vocal");
        } else {
            System.out.println(letra + " no es una letra");
        }
    }
}