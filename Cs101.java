package com.mycompany.javaguide1;
import java.util.Scanner;
import java.io.PrintWriter;

public class Cs101{
    
    public static void main(String[] args){
        
        double try1 = 7 / 2;
        int try2 = 50000 + 5000000;
        short lol = 0;
        for (int i = 1; i < 201; i++) {
            lol += i;
        }
        
        
        short try3 = lol;
        double try4 = 100 - 5000;
        
        System.out.println(try1);
        System.out.println(try2);
        System.out.println(try3);
        System.out.println(try4);
        
        int y = 2;
        y = y - --y;
        System.out.println(y);
               
        String str = new String("Technology through engineering to design.");
        str = str.substring(11);
        System.out.println(str);
        
        int x = 1, z = 2;
        double xx = 1.0, zz = 2.0;
        System.out.println(x > xx);
        System.out.println(z == zz);
        
        int label = 2;
        switch (label) {
            default: System.out.println("default");
            case 1:
                {
                    System.out.println("case 1");
                    switch (label) {
                        case 1:
                            System.out.println("case 11");
                        case 2:
                            System.out.println("case 12");
                    }
                }
            case 2:
                System.out.println("case 2");
            case 3:
                System.out.println("label 3");
        }
        
        char[] array1 = {
            'a',
            'b',
            'c'
        };
        System.out.println(array1[0]);
        
        /*Scanner sampleIn = new Scanner(System.in);
        PrintWriter sampleOut = new PrintWriter(System.out, false);
        String sIn = sampleIn.next();
        System.out.println(sIn);
        sampleOut.println(sIn);
        System.out.println("ok");
        int iIn = sampleIn.nextInt();
        System.out.println(iIn);
        sampleOut.close();
        */
        
        double decimalNumb = 1.1;
        System.out.printf("integer %d", decimalNumb);
        
    }
           
}