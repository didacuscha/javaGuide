package com.mycompany.javaguide1;

import java.util.Scanner;

public class ExtraExercise17 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero, vamos a mirar si es primo");
        int primo = scanner.nextInt();
        boolean flag = true;
        
        if (primo > 1 ) {
            for (int i = 2; i <= Math.sqrt(primo); i++) {
                if (primo % i == 0) {
                  
                    flag = false;
                    break;
                }
            } 
            
            if (flag == true) {
                System.out.println(primo + " es primo");
            } else {
                System.out.println(primo + " no es primo");
            }
            
        } else { 
                System.out.println("ingrese un numero mayor a 1");
        }
    }
}




