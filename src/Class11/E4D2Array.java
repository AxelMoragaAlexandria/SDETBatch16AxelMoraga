package Class11;

public class E4D2Array {
    public static void main(String[] args) {
//with the helop of loop count how many numbers in above arrays are even
        int[][]arr={
                {10,20,30,40,50},
                {1,2,3,4,5},
                {5,5,5,5,5},
                {10,8,6,4,2}
        };


        int count=0;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length;column++) {
                if(arr[row][column]%2==0){
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println("-----------------------");

           int counter=0;
        for (int[] arr1D : arr) {
            for (int anInt : arr1D) {
                if(anInt%2==0){
                    counter++;
                }
            }
        }
        System.out.println("counter = "+counter);
    }
}

