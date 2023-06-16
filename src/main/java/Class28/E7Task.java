package Class28;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
        How would handle InputMismatchException? Input Mismatch Exception when user enters mismatch value then programmer expected
         */
public class E7Task {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("Please Enter an Int");
            scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Please enter correct value");
        }
    }
}
