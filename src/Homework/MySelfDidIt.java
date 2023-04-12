package Homework;

import java.util.Scanner;

public class MySelfDidIt {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Hello User, What city are you from within in the United States?");
        String city=scan.nextLine();
        System.out.println("What is the temperature, Please put it in Celsius");
        Double celsius=scan.nextDouble();
        Double fahrenheit=(celsius*1.8)+32;

        System.out.println("Okay we see that temperature is "+fahrenheit+"F"+" and that you currently live in "+city);
    }
}
