package Class11;

public class E3D2Array {
    public static void main(String[] args) {
//ENHANCED FOR LOOP
        int[][]arr={
                {10,20,30,40,50},
                {1,2,3,4,5},
                {5,5,5,5,5},
                {10,8,6,4,2}
        };

        //print only odd numbers from this 2d array
        //arri{row}=gives me the array at the specific index by row
        //int {}innerArray=arri[row]=>innerArray.length

            for(int[]arr1D:arr){
                for(int num:arr1D){
                    System.out.println(num);
                }
            }







    }
}

