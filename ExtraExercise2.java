package com.mycompany.javaguide1;

public class ExtraExercise2 {
    
    public static void main(String[] args){
        
        int aux = 0;
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        
        //initial = a;
        //System.out.println(initial);
        aux = a;
        a = d;
        System.out.println("a with d value: " + a);
        
        //initial = b;
        //System.out.println(initial)
        a = b;
        b = c;
        System.out.println("b with c value: " + b);
        
        //initial = c;
        //System.out.println(initial);
        
        c = aux;
        System.out.println("c with a value: " + c);
        
        //initial = d;
        //System.out.println(initial);
        d = a;
        System.out.println("d with b value: " + d);
    }
}