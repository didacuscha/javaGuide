package com.mycompany.javaguide1;
import java.util.Scanner;

class exercise1a4y6{
 public static void main(String[] args){
     String name = "Diego";
     boolean flag;
     char dictionary;
     
     int numbera = 48;
     int numberb = 69;
     int age = 26;
     double decimals = 3.55;
     boolean flow = false;
     
     System.out.println(numbera - numberb);
     System.out.println("My name is " + name + " and I'm " + age + " years old.");
     
     Scanner input = new Scanner(System.in);
     System.out.println("Enter an integer: ");
     int numba = input.nextInt();
     
     //input.nextLine;
     System.out.println("Enter a second integer: ");
     int numba2 = input.nextInt();
     
     if (numba > 25 && numba2 > 25){
         System.out.println("Both numbers are bigger than 25");
     } else if (numba > 25 || numba2 > 25) {
         System.out.println("Just one of the inputs entered is bigger than 25");
     } else {
         System.out.println("None of the integers are bigger than 25");
     }
 }
 
}