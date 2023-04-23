package Class11;

public class E5D2Array {
    public static void main(String[] args) {

//with the help of loop you have to add all the elements for each row and print their sum
        int[][]arr={
                {10,20,30,40,50},
                {1,2,3,4,5},
                {5,5,5,5,5},
                {10,8,6,4,2}
        };


        for (int row = 0; row < arr.length; row++) {
            int sum=0;
            for (int column = 0; column < arr[row].length; column++) {
                        sum=sum+arr[row][column];
            }
            System.out.println(sum);
        }

    }
}
