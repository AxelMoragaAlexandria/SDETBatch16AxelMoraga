package class30;

public class E10Methods {


    public static int sumArr(int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        /*
        create a method that will take an array of ints and will return the sum of the elements of the array
        method should be accessible through out the project by just writing the name of the class
         */
        int[]numbers={10,10,10,10,10};
        int sum=sumArr(numbers);
        System.out.println(sum);



    }
}
