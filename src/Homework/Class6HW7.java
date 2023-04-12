package Homework;

import java.util.Scanner;

public class Class6HW7 {
    public static void main(String[] args) {

        Scanner scan= new Scanner (System.in);
        System.out.println("Hello, Please enter a grade");
        char grade=scan.next().charAt(0);

        if(grade=='A'){
            System.out.println("Excellent- Very well you got 100% on the test.");
        }else if (grade=='B'){
            System.out.println("Good- Nice, you got a couple answers wrong, but you still did well. ");
        }else if(grade=='C'){
            System.out.println("Average- It's okay but you still passed.");
        }else if(grade=='D'){
            System.out.println("Bad- Please study more.");
        }else {
            System.out.println("Not Acceptable- See the teacher after class.");
        }













    }
}
