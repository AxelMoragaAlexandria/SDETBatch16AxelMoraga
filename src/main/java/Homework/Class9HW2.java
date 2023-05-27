package Homework;

import javax.print.DocFlavor;

public class Class9HW2 {
    public static void main(String[] args) {

        /*
        Create an array of names and store all names of your group.
        Then print your name from that array. (use 2 different ways of creating an array).
         */

        String [] names={"Richard","Big Benz","Ronaldo","Axel","Felix","Logan"};
        System.out.println(names[3]);

        System.out.println("--------------------------------");
        String [] name= new String[6];
        name [0]="Richard";
        name [1]="Big Benz";
        name [2]="Ronaldo";
        name [3]="Axel";
        name [4]="Felix";
        name [5]="Logan";
        System.out.println(name[3]);








    }
}
