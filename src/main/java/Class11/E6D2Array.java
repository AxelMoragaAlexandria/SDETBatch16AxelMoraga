package Class11;

public class E6D2Array {
    public static void main(String[] args) {
//with the help of loops count how many times we have true in above 2Darray.

        boolean[][]arr= {
                {true, false, true, true, false},
                {true, false, false, false, false}
        };
int count=0;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if(arr[row][column]==true){
                    count++;
                }
            }

        }

        System.out.println(count);

        int count2=0;
        for (boolean[] booleans : arr) {
            for (boolean aBoolean : booleans) {
                if(aBoolean==true){
                    count2++;
                }
            }

        }

        System.out.println(count2);




    }

}
