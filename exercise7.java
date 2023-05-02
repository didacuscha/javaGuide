package com.mycompany.javaguide1;
import java.util.Scanner;

public class exercise7{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 4: ");
        int bomba = input.nextInt();
        
        switch (bomba) {
            case 1:  
                System.out.println("This is a water pump.");
                break;
            case 2:
                System.out.println("This is a gasoline pump");
                break;
            case 3: 
                System.out.println("This is a concrete pump");
                break;
            case 4:
                System.out.println("This is  a food paste pump");
                break;
            default:
                System.out.println("Error, the number you entered wasn't found"
                        + " please restart and use a number from 1 to 4.");
            
          
        }
    }
}
