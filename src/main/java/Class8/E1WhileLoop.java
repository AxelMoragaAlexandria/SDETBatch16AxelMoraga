package Class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {

        Scanner scan= new Scanner (System.in);
        System.out.println("Hello, please enter a starting number");
        int start=scan.nextInt();
        System.out.println("Please enter a ending number");
        int ending=scan.nextInt();
        System.out.println("Please enter the step of the increments");
        int step=scan.nextInt();

int number=start;
while(start<=ending){

    System.out.print(start+" ");
            start+=step;
}








     }
}

