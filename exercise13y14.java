package com.mycompany.javaguide1;
import java.util.ArrayList;

public class exercise13y14 {
    
    public static void main(String[] args){
        
        String[] compas = new String[4];
        
        compas[0] = "Diego";
        compas[1] = "Luis";
        compas[2] = "Jesus";
        compas[3] ="Angel";
        
        for (int i = 0; i < compas.length; i++) {
            System.out.println(compas[i]);
        }
        
        ArrayList <String> compitas = new ArrayList<>();
        compitas.add("Phillie");
        compitas.add("MigueS");
        compitas.add("Niche");
        compitas.add("MigueA");
        
        for (int i = 0; i < compitas.size(); i++) {
            System.out.println(compitas.get(i));
        }
    }
}