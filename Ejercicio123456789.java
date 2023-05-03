package com.mycompany.javaguide1;
import java.util.Scanner;

public class Ejercicio123456789{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome: " + name);
        
        System.out.println("Welcome to chatGPT! let's talk, ask me whatever you want!");
        String phrase = input.nextLine();
        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toLowerCase());
        
        System.out.println("So, I've spied on your location, what's the weather in Bogota?");
        int celsius = input.nextInt();
        int farenheit = 32 + (9 * celsius / 5);
        System.out.println("Oh okay, that's " + farenheit + " on farehnheit!");
        
        System.out.println("Enter an integer");
        int numa = input.nextInt();
        
        
        int doble = numa * 2;
        int triple = numa * 3;
        double root = Math.sqrt(numa);
        System.out.println("The double is: " + doble + "\nThe triple is: " + triple + "\nThe root is: " + root);
        
        System.out.println("Enter another integer");
        int numb = input.nextInt();
        
        if (numb % 2 == 0) {
            System.out.println(numb + " is an even number");
        } else {
            System.out.println(numb + " is an odd number");
        }
        
        int result = numa + numb;
        System.out.println("The sum of the integers is: " + result);
        
        
        System.out.println("Ok now enter the secret phrase to unlock 100 Bitcoins. \nHere it goes a clue, it's 8 letters. \nAnother clue, it starts with F.");
        input.nextLine();
        
        String passcode = input.nextLine();
        
        if (passcode.length() == 8 && passcode.substring(0,1).equals("F") && passcode.equals("Frida420") ) {
            System.out.println("Correct, access granted, enjoy your riches");
        } else {
            System.out.println("Sorry, you lost the opportunity of your life");
        }
    }
}