package com.mycompany.javaguide1;

import java.util.Scanner;

public class exercise5{
    
    public static void main(String[] args){
    System.out.println("Do you do your own research? answer true or false");
    Scanner bul = new Scanner(System.in);
    boolean dyor = bul.nextBoolean();
    System.out.println(dyor);
    
    System.out.println("Now enter a letter of the alphabet: ");
    Scanner letra = new Scanner(System.in);
    char a = letra.next().charAt(0);
    
        System.out.println(a);
 }
}
        
