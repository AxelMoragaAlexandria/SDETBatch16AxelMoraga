package Class7;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {
        //ask the user for a number than print all the numbers from 1 till that number

        Scanner scan= new Scanner(System.in);

        System.out.println("Hello Please enter a number greater than 1");
        int number=scan.nextInt();

        int counter=1;
        while(counter<=number){

            System.out.print(counter+ " ");
            counter++;

        }





    }
}
