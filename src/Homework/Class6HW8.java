package Homework;

import java.util.Scanner;

public class Class6HW8 {
    public static void main(String[] args) {

Scanner scan= new Scanner(System.in);

        System.out.println("Please enter first number");
        double number1=scan.nextInt();
        System.out.println("Please enter a operator like (+,-,*,/");
        char operator=scan.next().charAt(0);
        System.out.println("Please enter second number");
        double number2=scan.nextInt();

        double sum=number1+number2;
        double subtract=number1-number2;
        double multiply=number1*number2;
        double divide=number1/number2;
        double result=(0);

        if(operator=='+'){
                System.out.println(result=sum);
        }else if(operator=='-'){
                System.out.println(result=subtract);
        }else if (operator=='*'){
                System.out.println(result=multiply);
        }else if(operator=='/'){
                System.out.println(result=divide);
        }

            System.out.println("Result="+result);


















    }
}
