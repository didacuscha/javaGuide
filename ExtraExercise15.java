package com.mycompany.javaguide1;

import java.util.Scanner;

public class ExtraExercise15 {
    
    public static int sum(int numa, int numb){
        int suma = numa + numb;
        System.out.println(suma);
        return suma;
    }
    
    public static int resta(int numa, int numb){
        int subs = numa - numb;
        System.out.println(subs);
        return subs;
    }
    
    public static int mult(int numa, int numb){
        int multi = numa * numb;
        System.out.println(multi);
        return multi;
    }
    
    public static int div(int numa, int numb){
        int divi = numa / numb;
        System.out.println(divi);
        return divi;
    }
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first integer: ");
        int numa = scanner.nextInt();
        System.out.println("Enter a second integer: ");
        int numb = scanner.nextInt();
        
        System.out.println("Enter 1 to add \nEnter 2 to substract \nEnter 3 to multiply \nEnter 4 to divide");
        int pick = scanner.nextInt();
        
        switch (pick) {
            case 1 :
                sum(numa, numb);
                break;
            case 2 :    
                resta(numa, numb);
                break;
            case 3 :
                mult(numa, numb);
                break;
            case 4 :
                div(numa, numb);
                break;
            default :
                System.out.println("Error, please choose one of the calculator options.");
        }
    }  
}