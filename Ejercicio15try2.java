package com.mycompany.javaguide1;

public class Ejercicio15try2 {
    
    public static int ascending(int substraction){
        for (int i = 0; i < 101; i++) {
            System.out.println(i);
            substraction = substraction + i;
        } 
        return substraction;
    }
    
    public static void descending(){
        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args){
        ascending(0);
        System.out.println("===============");
        descending();
    }
}
