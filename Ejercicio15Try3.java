package com.mycompany.javaguide1;

public class Ejercicio15Try3{
    
    public static void descending(){
       for (int i = 100; i > -1; i--) {
            System.out.println(i);
        } 
    }
    
    public static int ascending(int ascend){
        
        
        for (int i = 0; i < 101; i++) {
            System.out.println(i);
        }
        return ascend;
    }
    
    public static void main(String[] args){
        
        descending();
        System.out.println("=================================================");
        ascending(1);
    }
}