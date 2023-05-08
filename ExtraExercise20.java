package com.mycompany.javaguide1;
import java.util.Random;

public class ExtraExercise20{
    
    public static double[] rellenar(double[] vector){
        
        for (int i = 0; i < vector.length; i++) {
            double randomNum = Math.random() * 100 + 1;
            vector[i] = randomNum;
        }
        
        return vector;
    }
    
    public static double[] imprimir(double[] vector){
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        return vector;
    }
    
    public static void main(String[] args){
        
        double[] vector = new double[50];
        vector = rellenar(vector);
        imprimir(vector);
    }
}