package com.mycompany.javaguide1;
import java.util.Scanner;
import java.util.Random;

public class ExtraExercise23 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        char[][] soup = new char[20][20];
        for (int i = 0; i < soup.length; i++) {
            for (int j = 0; j < soup[0].length; j++) {
                soup[i][j] = (char) (rand.nextInt(26) + 'A');
            }
            
        }
        
        String[] words = new String[5];

        // Read the words from the user
        for (int k = 0; k < 5; k++) {
            System.out.println("Enter word " + (k + 1) + ": ");
            words[k] = scanner.nextLine();
        }

        for (int k = 0; k < 5; k++) {
            String word = words[k];
            int wordLength = word.length();

            // Generate random starting coordinates within the bounds of the soup grid
            int startX = rand.nextInt(soup.length);
            int startY = rand.nextInt(soup[0].length);

            // Check if the word can be inserted without going out of bounds
            if (startX + wordLength <= soup.length) {
                // Insert the word horizontally
                for (int i = 0; i < wordLength; i++) {
                    soup[startX + i][startY] = word.charAt(i);
                }
            } else if (startY + wordLength <= soup[0].length) {
                // Insert the word vertically
                for (int i = 0; i < wordLength; i++) {
                    soup[startX][startY + i] = word.charAt(i);
                }
            } else {
                System.out.println("Cannot insert word: " + word);
            }
        }

        // Print the updated soup grid with inserted words
        System.out.println("\nUpdated soup grid:");
        for (int i = 0; i < soup.length; i++) {
            for (int j = 0; j < soup[0].length; j++) {
                System.out.print(soup[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    
