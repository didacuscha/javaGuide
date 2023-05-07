package com.mycompany.javaguide1;

import java.util.Scanner;

public class ExtraExercise5{
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your type of share: (A/B/C)");
        String type = scanner.next();
        
        double cost = 1000;
        
        if (type.equalsIgnoreCase("a")) {
            System.out.println("Your A shares cost: " + cost + "\nYou will get a 50% discount on treatments");    
        } else if (type.equalsIgnoreCase("b")) {
            double Bcost = cost * 0.8;
            System.out.println("Your B shares cost: " + Bcost + "\nYou will get a 35% discount on treatments");
        } else {
            double Ccost = cost * 0.5;
            System.out.println("Your C shares cost: " + Ccost + "\nYou will not get discount on treatments");
        }
        
    }
}