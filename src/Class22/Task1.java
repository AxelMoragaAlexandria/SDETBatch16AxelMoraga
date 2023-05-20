package Class22;

public class Task1 {

    //Create a method that will find a number from an array
    public int findArr(int[] num, int number){

        for (int i = 0; i <num.length; i++) {
                if(num[i]==number){
                 return number;
                }
        }
        return number;
    }

    //Create a method to get the average of numbers from an array
    public int numAverage(int[]arr){
        int num=0;
        for (int i = 0; i < arr.length; i++) {
                num=num+arr[i];
        }
       return num/arr.length;
    }

    //Create a method that will Count how many times the number is appearing in an array
    public int TotalNum(int[]arr, int num){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                sum++;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Task1 obj=new Task1();
        int[]arr={1,2,3,4,5,6};
        int result=obj.findArr(arr,3);
        System.out.println(result);

        System.out.println("--------------------------");
        Task1 obj1=new Task1();
        int []arr1={5,5,2,3,0,2,203};
      int result1=obj1.TotalNum(arr1,5);
        System.out.println(result1);
    }




}
