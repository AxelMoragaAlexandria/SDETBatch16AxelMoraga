package Class13;

public class ArrayUtil {
    public static void main(String[] args) {
//write the logic to search if the number is present in that array or not


        int[]array={10,20,45,100};
        int []arr1={12,32,455,889};
        int []arr2={120,302,5,889};

int number=100;
int number1=10;
int number2=10;

        ArrayUtil nice=new ArrayUtil();
        nice.searchArray(array,number);
        nice.searchArray(arr1,number1);
        nice.searchArray(arr2,number2);

    }

    void searchArray(int[]arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                System.out.println("It's there");
                break;
            }
        }


    }
}
