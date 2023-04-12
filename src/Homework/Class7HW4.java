package Homework;

public class Class7HW4 {
    public static void main(String[] args) {

        // Print odd numbers between 20 and 50 (2 ways) While Loop:For Loop

        int i=20;
        while(i<=50) {
            if (i%2==1) {
                System.out.print(i+" ");

            }
            i += 1;

        }

        for(int j=20;j<=50;j+=1) {
            if (j%2==1) {
                System.out.print(j+" ");

            }

        }








    }
}
