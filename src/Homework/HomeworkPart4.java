package Homework;

import java.util.Scanner;

public class HomeworkPart4 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Hello what city are you in right now?");
        String city=scan.nextLine();
        System.out.println("What is the temperature in fahrenheit?");
        double fahrenheit=scan.nextDouble();
        double celsius=(fahrenheit-32)*5/9;



        System.out.println("The temperature is "+celsius+ "The city is "+city);
    }
}
