package com.mycompany.javaguide1;

import java.util.Scanner;

public class ExtraExercise4 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10");
        String input = scanner.next();
        
        switch (input) {
            case "1":
                System.out.println(input + " in roman is: I");
                break;
            case "2":  
                System.out.println(input + " in roman is: II");
                break;
            case "3":  
                System.out.println(input + " in roman is: III");
                break;
            case "4":  
                System.out.println(input + " in roman is: IV");
                break;
            case "5":  
                System.out.println(input + " in roman is: V");
                break;
            case "6":  
                System.out.println(input + " in roman is: VI");
                break;
            case "7":  
                System.out.println(input + " in roman is: VII");
                break;
            case "8":  
                System.out.println(input + " in roman is: VIII");
                break;
            case "9":  
                System.out.println(input + " in roman is: IX");
                break;
            case "10":  
                System.out.println(input + " in roman is: X");
                break;
            case "0":  
                System.out.println(input + " in roman doesn't exists");
                break;
            default :
                System.out.println("Error, enter please a number from 1 to 10.");
        } 
    }
}