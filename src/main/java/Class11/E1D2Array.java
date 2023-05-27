package Class11;

public class E1D2Array {
    public static void main(String[] args) {

        int[][]arr={
                {10,20,30,40,50},
                {1,2,3,4,5},
                {5,5,5,5,5},
                {10,8,6,4,2}
        };

        //print only odd numbers from this 2d array
        //arri{row}=gives me the array at the specific index by row
        //int {}innerArray=arri[row]=>innerArray.length
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                        if(arr[row][column]%2==1){
                            System.out.print(arr[row][column]+" ");
                        }
            }
            System.out.println();
        }









    }
}
