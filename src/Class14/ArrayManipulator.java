package Class14;

public class ArrayManipulator {

    /*
        Create a method that will take an int array call it sumArr
        and return the sum of all the elements from that array
        create the object of the class and call the method

 */

    int sumArr(int[] arr){
        int sum=0;
        for (int i = 0; i <arr.length; i++) {
                sum=sum+arr[i];
        }
            return sum;
    }

    public static void main(String[] args) {
        ArrayManipulator obj=new ArrayManipulator();
        int[] array={10,20,30};
       int result=obj.sumArr(array);
        System.out.println(result);




    }



}
