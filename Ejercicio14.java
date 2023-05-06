package com.mycompany.javaguide1;

import java.util.Scanner;

public class Ejercicio14 {
    
    public static int forex(int euros, int convert){
        
        double eurusd = 1.10;
        double eurjpy = 148.99;
        double eurgbp = 0.87;
        double eurcop = 4986;
        double eurbrl = 5.45;
        double newTotal = 0;
        
        switch (convert) {
            case 1:
                newTotal = euros * eurusd;
                System.out.println("You now have " + newTotal + " dollars");
                break;
            case 2:
                newTotal = euros * eurjpy;
                System.out.println("You now have " + newTotal + " yens");
                break;
            case 3:
                newTotal = euros * eurgbp;
                System.out.println("You now have " + newTotal + " pounds");
                break;
            case 4:
                newTotal = euros * eurcop;
                System.out.println("You now have " + newTotal + " cop");
                break;
            case 5:
                newTotal = euros * eurbrl;
                System.out.println("You now have " + newTotal + " reals");
                break;
            default:  
                System.out.println("Please choose an option from 1 to 5 according to the currency to convert.");
                break;
        }
            
        
        return euros;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su cantidad de euros para convertir: ");
        int euros = scanner.nextInt();
        
        System.out.println("Ingrese 1 para convertir a dolares \n2 para convertir a yenes \n3 para convertir a libras \n4 para convertir a cop \n5 para convertir a reales de brazil");
        int convert = scanner.nextInt();
        
        forex(euros, convert);
        
        
        
    }
}