package Homework;

public class Class9HW7 {
    public static void main(String[] args) {

/*
From an array of integer elements find the largest number.
 */
        int [] numbers={5,10,30,40,50,100,300,800};

        int largestNumber=numbers[0];

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largestNumber){
                largestNumber=numbers[i];
            }

        }
        System.out.println(largestNumber);





    }
}
