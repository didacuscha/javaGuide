package com.mycompany.javaguide1;
import java.util.Scanner;

public class exercise12{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numa = input.nextInt();
        System.out.println("Enter another number: ");
        int numb = input.nextInt();
        
        esMultiplo(numa, numb);
    }
    
    public static void esMultiplo (int numa, int numb){
        
        if (numa % numb == 0 ){
            System.out.println("a is multiple of b");
        }else if (numb % numa == 0){
            System.out.println("b is multiple of a");
        } else {
            System.out.println("nor a nor b are multiples of each other");
        }    
    }
}