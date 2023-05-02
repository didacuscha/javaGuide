package com.mycompany.javaguide1;
import java.util.Scanner;

public class exercise8{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter your expected grade from the bootcamp on a range from 0 to 10: ");
        //int grade = input.nextInt();
        int grade = -1;
            
        while (!(grade < 11 && grade > -1)) {
            System.out.println("Enter your expected grade from the bootcamp on a range from 0 to 10: ");
            grade = input.nextInt();
        }
            
        // with do while 
        
        int nota;
        
        do {
            System.out.println("Enter your expected nota(grade) from the bootcamp on a range from 0 to 10: ");
            nota = input.nextInt();
        } while (!(nota < 11 && nota > -1));
        
        
        System.out.println("Your expected grade is: " + grade);
        System.out.println("Your expected nota is: " + nota);
        /*
        Scanner leer = new Scanner(System.in);
        String answer = "S";
        
        while (answer.equalsIgnoreCase("S")) {
            System.out.println("Continue?");
            answer = leer.nextLine();
        }
        */
    }
}