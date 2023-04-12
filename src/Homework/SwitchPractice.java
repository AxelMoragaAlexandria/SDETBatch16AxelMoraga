package Homework;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {


            Scanner scan= new Scanner (System.in);

        System.out.println("Please enter your country please");
            String country=scan.nextLine();

            switch (country){

                case "United States":
                    System.out.println("English");
                 break;
                case "Guatemala":
                    System.out.println("Spanish");
                    break;
                case "Portugal":
                    System.out.println("Portuguese");
                    break;
                case "El Salvador":
                    System.out.println("Spanish");
                    break;
                case "Chinese":
                    System.out.println("Mandarin");
                    break;
                case "South Africa":
                    System.out.println("IsiZulu");
                    break;
                default:
                    System.out.println("Country Invalid");





        }







    }
}
