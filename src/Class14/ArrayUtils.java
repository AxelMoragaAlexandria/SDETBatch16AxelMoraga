package Class14;

public class ArrayUtils {

    /*
    Create a method to add two int numbers and it should return
    the result back when called name of the methhod should be add

    return type=> int
    name=>add
    parameters==>(int a, int b)
     */


int add(int a, int b){
    int sum=a+b;
    return sum;
}

    public static void main(String[] args) {
        ArrayUtils obj=new ArrayUtils();
        /*
        We are calling the "add" method on obj object passing two arugments one
        is 10 other is 20 and storing the result from method call into the sum
        variable
         */
        int sum=obj.add(10,20);
        System.out.println(sum);
    }


}
