package com.mycompany.javaguide1;
import java.util.Scanner;

public class extraExercise1 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time in minutes: ");
        int minutes = scanner.nextInt();
        
        int daysMinutes = 1440;
        int days;
        int minutesSansDays;
        int hoursMinutes = 60;
        int hours;
        int minutesSansHours;
        
        if (minutes >= daysMinutes){
            days = minutes / daysMinutes;
            minutesSansDays = minutes - (daysMinutes * days);
            if (minutesSansDays >= hoursMinutes){
                hours = minutesSansDays / hoursMinutes;
                minutesSansHours = minutesSansDays - (hoursMinutes * hours);
                System.out.println(days + " days " + hours + " hours " + minutesSansHours + " minutes");
            } else {
                System.out.println(days + " days " + minutesSansDays + " minutes");
            }   
            
        } else if (minutes > hoursMinutes){
            hours = minutes / hoursMinutes;
            minutesSansHours = minutes - (hoursMinutes * hours);
            System.out.println(hours + " hours " + minutesSansHours + " minutes");
        } else {
            System.out.println(minutes + " minutes");
        }
            
        
    }
}