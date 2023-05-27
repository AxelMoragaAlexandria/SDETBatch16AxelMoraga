package Homework;

public class Class9HW6 {
    public static void main(String[] args) {


        /*
        Create an array on integers and calculate the sum of all elements in an array
         */


        int [] numbers={10,10,10,10,10,10,10};

        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
                    sum=sum+numbers[i];

        }

        System.out.println(sum);

    }
}
