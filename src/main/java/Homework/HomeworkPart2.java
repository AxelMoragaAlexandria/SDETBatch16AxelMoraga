package Homework;

import java.util.Scanner;

public class HomeworkPart2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("How much money do you need for a loan?");
        Double moneyLoan=scan.nextDouble();

        if (moneyLoan<=200000){
            System.out.println("Okay we will loan you the money the amount of "+moneyLoan);
        }else{
            System.out.println("Sorry, I can't loan you the money of "+moneyLoan);
        }
    }
}
