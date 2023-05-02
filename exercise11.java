package com.mycompany.javaguide1;

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to codify it: ");
        String phrase = input.nextLine();
        String modified = cambia(phrase);
        System.out.println("Encoded phrase turn on:  \n" + modified);
        
    }
    
    public static String cambia(String phrase) {
        switch (phrase){
            case "a":
               phrase = phrase.replace('a', '@');
               break;
            case "e":
               phrase = phrase.replace('e', '#');  
            case "i":
               phrase = phrase.replace('i', '$');  
            case "o":
               phrase = phrase.replace('o', '%');     
            case "u":
               phrase = phrase.replace('u', '*');  
                break;
            
        }
        return phrase;
    }
    
}