package com.mycompany.javaguide1;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args){
        
        int[] vector = new int [100];        
        fill(vector);
        
    }
    public static void fill(int[] vector){
        
        for (int i = 0; i < 100; i++) {           
            vector[i] = i+1;
            System.out.println(vector[i]);
        }
    }
}   