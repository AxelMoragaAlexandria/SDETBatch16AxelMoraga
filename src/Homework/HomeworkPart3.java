package Homework;

import java.util.Scanner;

public class HomeworkPart3 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Hello. Welcome to the DMV First I need to know your age to before we move on with the two options");
        int Num1=scan.nextInt();

        if(Num1>=18){
            System.out.println("Okay, great we will issue you a driver license! ");
        }else{
            System.out.println("Since you are under the age of 18, would you like to get a learners permit?");
        }
    }
}
