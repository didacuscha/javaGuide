package com.mycompany.javaguide1;

public class Ejercicio17{
    
    public static void main(String[] args){
        
        int[] vector = {69, 420, 1010, 9, 10000};
        
        int digitCount = 0;
        int tempNum = 0;
        
        for (int i = 0; i < vector.length; i++) {
            
            tempNum = vector[i];
            
            while (tempNum != 0) {
                tempNum /= 10;
                digitCount++;
            }
            
            System.out.println("Number of digits in " + vector[i] + ": " + digitCount);
            digitCount = 0;
        }
    }
}