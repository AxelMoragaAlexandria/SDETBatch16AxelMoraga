package Class13;

public class Math {

    //defining a method
    void add(int a, int b){
        System.out.println(a+b);

    }
    //defining a method
    void multiply(int a, int b){
        System.out.println(a*b);
    }
    //defining a method
    void subtract(int a, int b){
        System.out.println(a-b);
    }
    //defining a method
    void divide(int a, int b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        //creating the object of Math class calling it math
        Math math=new Math();
        //calling the method add and passing two values
        math.add(5,5);

        math.multiply(6,6);

        math.subtract(10,5);
        math.divide(10,2);

    }





}
