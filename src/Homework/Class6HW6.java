package Homework;

import java.util.Scanner;

public class Class6HW6 {
    public static void main(String[] args) {

        /*Task 6: Ask user to enter their country and capture it. Once values are captured print
        which language user speaks.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Hello what country were you born?");
        String country=scan.nextLine();

        if(country.equals("United States")){
            System.out.println("You speak English");
        }else if (country.equals("Mongolia")){
            System.out.println("You speak Mongolian");
        }else if(country.equals("Brazil")){
            System.out.println("You speak Portuguese");
        }else if(country.equals("Guatemala")){
            System.out.println("You speak Spanish");
        }else if (country.equals("El Salvador")){
            System.out.println("You speak Spanish");
        }else if (country.equals("South Africa")){
            System.out.println("You speak IsiZulu");
        }else if (country.equals("Nigeria")){
            System.out.println("You speak Hausa, Yoruba, and English");
        }













    }
}
