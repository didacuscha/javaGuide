package com.mycompany.javaguide1;
import java.util.Scanner;

public class ExtraExercise13Try3 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the stair: ");
        int length = scanner.nextInt();
        
        for (int i = 1; i <= length; i++) {
            String stair = " ";
            
            for (int j = 1; j <= i; j++) {
                stair += j;
            }
            
            System.out.println(stair);
        }
    }
}