package Homework;

import java.util.Scanner;

public class Class6HW3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("What is your current time please in 24 format");
            int time=scan.nextInt();

            if(time>=1&&time<=11){
                System.out.println("Morning");
            }else if(time>=12&&time<=15){
                System.out.println("Afternoon");
            }else if(time>=16&&time<=20){
                System.out.println("Evening");
            }else if(time>=21&&time<=24){
                System.out.println("Night");
            }











    }
}
