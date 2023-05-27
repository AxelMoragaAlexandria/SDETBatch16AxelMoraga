package Homework;

public class Class9HW4 {
    public static void main(String[] args) {

        /*
        Create an array of cars and store 6 elements into it.
        Using 2 different loops print all values from the array.
         */

String [] cars={"Honda","Toyota","BMW","Mercedes","Subaru","Ford"};

        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]+" ");

        }
        System.out.println();

        int number=0;
        while(number< cars.length){

            System.out.print(cars[number]+" ");
            number+=1;

        }










    }
}
