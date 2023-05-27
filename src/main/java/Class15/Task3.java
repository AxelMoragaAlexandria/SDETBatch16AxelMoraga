package Class15;

public class Task3 {
    int sumArr(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        Task3 obj=new Task3();
        int[]arr={10,10,10,10,10};
       int sum =obj.sumArr(arr);
        System.out.println(sum);
    }
}
