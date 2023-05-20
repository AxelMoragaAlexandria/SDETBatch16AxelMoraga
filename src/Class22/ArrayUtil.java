package Class22;

public interface ArrayUtil {
// search the array for the number if found return true;
    public boolean searchArr(int[]arr,int number);

    double getAvg(double arr[]);

    int getCount(double[]arr,double number);

    int add(int num1,int num2);

}

class Main implements ArrayUtil{

    @Override
    public boolean searchArr(int[] arr, int number) {


        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                return true;
            }
        }
        return false;

    }

    @Override
    public double getAvg(double arr[]) {
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum/arr.length;
    }

    @Override
    public int getCount(double[] arr, double number) {
            int count=0;
        for (int i = 0; i < arr.length; i++) {
                    if(arr[i]==number){
                        count++;
                    }
        }
        return count;
    }

    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }
}
